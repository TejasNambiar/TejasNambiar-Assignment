const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');

// set up the express app
const app = express();

//connect to mongodb
mongoose.connect('mongodb://localhost/inventory1');
mongoose.Promise = global.Promise;

// parse json data for us
app.use(bodyParser.json());

// middleware: initialize routes
app.use('/api',require('./routes/api'));

// middleware: error handling 
app.use(function(error,request, response, next){
    // console.log(err);
    response.status(422).send({error: error.message});
});

app.get('/inventory', function(request, response){
    console.log('GET request');
    response.send({name:'yosh'});
});

// listen for requesrt
app.listen(process.env.port||4000, function(){
    console.log("now listening for requests");
});
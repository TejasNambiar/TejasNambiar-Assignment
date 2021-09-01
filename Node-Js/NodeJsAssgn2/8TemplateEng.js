const express = require('express');
const app = express();

// by default looks in view folder
app.set('view engine', 'ejs');
app.get('/', function(request, response){
    response.render('index', {date: new Date().toDateString()});
});

app.listen(process.argv[2]);
const { response } = require('express');
const express =require('express');
const router = express.Router();
const Ninja = require('../models/ninjas');

// 1.A retrieve entire inventory from db (needs work)
router.get('/inventory', function(request,response,next){
    Ninja.find({}).then(function(ninjas){
        response.send(ninjas);
    });
    //response.send({type:'GET'});
});

// 1.B retrieve an inventory item from db based on name
router.get('/inventory/:name', function(request,response,next){
    Ninja.findOne({name:request.params.name}).then(function(ninja){
        response.send(ninja);
    });
    
   // response.send({type:'GET'});
});

// 3. add a new ninjas from the db
router.post('/inventory', function(request,response,next){
    // creates a new instace for object and saves the data to mongoose
    Ninja.create(request.body).then(function(ninja){
        response.send(ninja);
    }).catch(next);
    //moves to next command should error arise
});

// 2.B update a inventory item from the db based on name
router.put('/inventory/:name', function(request,response,next){
    Ninja.findOneAndUpdate({name:request.params.name},request.body).then(function(){
        // used to bring out latest info on object
        Ninja.findOne({name:request.params.name}).then(function(ninja){
            response.send(ninja);
        });
    });
});

// 4.A Delete all Inventory from the db
router.delete('/inventory', function(request,response,next){
    Ninja.deleteMany({}).then(function(ninja){
        response.send(ninja);
    });
});

// 4.B Delete a Inventory from the db by name
router.delete('/inventory/:name', function(request,response,next){
    Ninja.deleteOne({name:request.params.name}).then(function(ninja){
        response.send(ninja);
    });
});

module.exports = router;

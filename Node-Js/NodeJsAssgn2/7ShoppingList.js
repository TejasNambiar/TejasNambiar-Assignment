const express = require('express');
const bodyParser = require('body-parser');
const itemsList = require('./itemsList.json');
const fs = require('fs')

// Express app
const app = express();
app.use(express.json());

// Initializing array
var items = [
    { id: 1, product: 'Milk' },
    { id: 2, product: 'Butter' },
    { id: 3, product: 'Curd' },
    { id: 4, product: 'Panner' }
  ];

// Middleware for parsing bodies from URL
app.use(bodyParser.urlencoded({ extended: false }));

// GET/items
app.get('/items', (req, res) => {
  if (items) {
    // prints the items list
    res.send(items);
  } else {
    res.send('List is empty. Please add items in the list');
  }
});

// POST/items
app.post('/item1', (req, res) => {
  var item = req.body;
  // takes the items changed in the body and adds it to the list
  items.push(item);

  var inputItems = req.body;
  console.log(inputItems)
  itemsList.items.push({...inputItems})
  fs.writeFile('./itemsList.json', JSON.stringify(itemsList), (error) =>{
    if(error){
        res.send("Could not register "+inputItems.product +"'\n"+ error)
    }
    else{
        res.send("Successfully registered"+inputItems.product +"'")
    }
  })
});

// GET/items/:id
app.get('/items/:id', (req, res) => {
  const itemId = parseInt(req.params.id);
  // find(variable => item.id (id of object item from list) === itemId (id taen from url))
  const item = items.find(item => item.id === itemId);
  if (item) {
    res.send(item);
  } else {
    res.send('Item is not available in the list');
  }
});

// PATCH/items/:id
app.patch('/patch/items/:id', (req, res) => {
  var item = items.findIndex(item => item.id == req.params.id);
  if (items[item]) {
    items[item].product = req.body.product;
    res.send('Item is updated in the list');
    // console.log(items[item]);
  }
  else {
    res.send('Item is not available in the list');
  }
});

// DELETE/items/:id
app.delete('/items/:id', (req, res) => {
  const itemId = parseInt(req.params.id);
  var item = items.find(item => item.id == itemId);
  if (item) {
    items.splice(items.indexOf(item), 1);
    res.json(items);
  }
  else {
    res.send('Item is not available in the list');
  }
});

// To bind and listen the connections on the specified host and port
app.listen(3000, console.log("Listening on port 3000..."));
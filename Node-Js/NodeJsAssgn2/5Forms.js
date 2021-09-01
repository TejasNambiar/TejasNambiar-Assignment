// to complete
const express = require('express')
const bodyParser = require('body-parser')
const app = express()


app.use(bodyParser.urlencoded({extended: false}))
app.use(express.json())
// by default looks in view folder
app.set('view engine', 'ejs');

app.get('/formGet', function(req, res) {
  res.render('formReverse')
})

app.get('/formPost', (req, res) =>{
  var required = req.query.String;
  if (required != "") {
    res.send("<h3>Your string is " + required + "\n"+
    "and reversed string is "+required.split('').reverse().join('')+"</h3>");
  }
  else {
    response.send("Please provide us a string");
  }
})

app.post('/form/:name', function(req, res) {
  var name = req.params.name
  console.log(name)
  res.send(name.split('').reverse().join(''))
})

app.listen(2000, ()=>{
  console.log('listening to 2000')
})
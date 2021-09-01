var express = require('express');

var app = express();
// by default looks in view folder
app.set('view engine', 'ejs');

app.use(express.static('public'));
app.get('/index', (req, res) => {
    res.render("caption");
});

app.listen(3030);
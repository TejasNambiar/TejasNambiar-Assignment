const express = require('express');
const event = new Date();

// express app
const app = express();

// routes
app.get('/', function (req, res) {
    res.send('Hello, World!');
});

app.listen(process.env.port || process.argv[2]);
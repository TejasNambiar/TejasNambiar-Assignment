const express = require('express');
const app = express();
const fs = require('fs');

app.get('/books', function(request, response){ 
  fs.readFile('books.json','utf8',(err, data) => {
    if (err)
      return response.sendStatus(500)
    else
      response.send(data);
  });
});

app.listen(3000);
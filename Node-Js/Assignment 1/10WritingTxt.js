var fs = require ('fs');
var nameFile = "text3.txt";
var textToWrite = 'ho ho ho! lets go!';

fs.writeFile(nameFile, textToWrite, function(err) {
  if (err) throw err;
  console.log('The file has been saved!');
});

fs.readFile(nameFile, 'utf8', function(err, data) {  
    if (err) throw err;
    console.log(data);
});
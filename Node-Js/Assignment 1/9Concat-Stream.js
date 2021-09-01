var fs = require('fs');

var fileToRead = 'numsq8.txt';

console.log('Reading the file ' + fileToRead + '..');
fs.readFile(fileToRead, 'utf8', function(err, data) {  
    if (err) throw err;
    console.log('Returning the values of the file as a array:');
    var contents = data.split(' ');
    console.log(contents);
});
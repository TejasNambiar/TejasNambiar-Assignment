//requiring path and fs modules
const path = require('path');
const fs = require('fs');

//joining path of directory 
const directoryPath = path.join(__dirname, './');

//console.log("dir name "+__dirname+" path: "+directoryPath);
//passsing directoryPath and callback function
fs.readdir(directoryPath, function (err, files) {
    //handling error
    if (err) {
        return console.log('Unable to scan directory: ' + err);
    } 

    //listing all files using forEach
    files.forEach(function (file) {
        var stats = fs.statSync(`./${file}`);
        console.log((stats.isFile()?"FILE":"DIR")+': '+file); 
    });
});
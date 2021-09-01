var fs = require('fs');

//reads from current directory
var myReadStream = fs.createReadStream(__dirname + '/LargeData.txt','utf8');

myReadStream.on('data',function(chunk){
    console.log('new chunk received:');
    console.log();
    console.log(chunk);
});
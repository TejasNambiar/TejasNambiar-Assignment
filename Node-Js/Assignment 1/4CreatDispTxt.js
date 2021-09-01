var fs = require('fs');

data = 'Hey ho, lets go!';
fs.writeFileSync('text2.txt',data);
console.log('The file was saved!');
console.log(data);
fs.readFile('text2.txt','utf8', function(err,data){
    console.log(`text2 contains: ${data}`);
});
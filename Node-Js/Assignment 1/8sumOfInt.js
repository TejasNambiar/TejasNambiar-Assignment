var fs = require('fs');
var fileName = 'numsq8.txt';

fs.readFile(fileName, 'utf8', function(err, data) {  
    if (err) throw err;
    var Numbers = data.split(' ').map(function(num){
            return parseInt(num)
        }
    );
    var total = Numbers.reduce(function(acc, currentNumber){
        return acc + currentNumber;
    });
    console.log('The result of sum all numbers is: ' + total);
});
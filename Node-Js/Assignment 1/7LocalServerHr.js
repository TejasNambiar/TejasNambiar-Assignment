var strftime = require('strftime');

function time(){
    var d = new Date();
    return strftime('%Y-%m-%d: %H:%M', d); 
}

console.log(time());
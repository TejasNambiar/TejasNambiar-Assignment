var http = require('http');
var server = http.createServer(function(request, response){
    response.writeHead(200,{'Content-Type':'text/plain'});
    response.end(`Success, I'm listening from port: 3000`);
});

// setting up port on local host for 
// nodejs to connect to
server.listen(3000, '127.0.0.1');

//printing a msg sothat we now it listening to it
console.log('Now connected to port 3000');
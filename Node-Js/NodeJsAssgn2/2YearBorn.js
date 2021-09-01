const express = require('express');

const app = express();

app.get('/year', function(request, response){
    
    response.set({ 'Content-Type': 'text/plain; charset=utf-8' });
    
    const age = request.query.age;
    let currentYear = new Date().getFullYear();
    let year = currentYear - age;
    response.send(`You were born in ${year}.`);
});

app.listen(3000, () => console.log('Listening to port 3000...'));
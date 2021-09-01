//4th question
let chatroom1 = new Map();
chatroom1.set('sai', {
    msg1: " Hi everyone, I'm Bhushan Bire",
    msg2: " How are you all?"
});
chatroom1.set('Bravo', {
    msg1: " Hello, I'm Bravo",
    msg2: " I'm fine",
    msg3: " What do you do?"
});
chatroom1.set(' Charlie', {
    msg1: " Hey, I'm Charlie",
    msg2: " I'm good",
    msg3: " I'm a Developer",
    msg4: " Let's  evelop an application..."
});
let chatroom2 = new Map()
    .set(' Remo', {
        msg1: " Hey guys, I'm Remo",
        msg2: " I'm from UK",
        msg3: " Tell me a bout yours..."
    })
    .set('Sam', {
        msg1: " Hi, I'm Sam",
        msg2: " I am from US"
    });
// To check all the users in chatroom1
console.log(" Total users in chatroom1: " + chatroom1.size);
// To list the users and messages
for (let [key, value] of chatroom1) {
    console.log(key, value);
}
// T o check all the users in chatroom2
console.log(" Total users in chatroom2 : " + chatroom2.size)
chatroom2.forEach((value, key, map) => {
    console.log(` ${key} `);
    console.log(chatroom2.get(` ${key} `));
})
// To get the messages of specific user
console.log(chatroom1.get("sai"));
// To check user is in chatroom or not
console.log(chatroom1.has("Bravo"));
// To delete the user from chatroom
console.log(chatroom1.delete("Charlie"));
// To clear the chatroom
chatroom1.clear();
console.log(" Total users in chatroom1: " + chatroom1.size);
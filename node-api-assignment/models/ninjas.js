const mongoose = require('mongoose');
const Schema = mongoose.Schema;

// create Ninja Schema & model
const NinjaSchema = new Schema({
    name:{
        type: String,
        required: [true,'Name field is required']
    },
    quantity:{
        type:Number,
        required:[true, 'Quantity Field is required']
    }
});

const Ninja = mongoose.model('ninja',NinjaSchema);
module.exports = Ninja;
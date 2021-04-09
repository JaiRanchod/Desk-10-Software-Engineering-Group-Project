var mongoose = require('mongoose');

var userProfiles = new mongoose.Schema({
    firstName: { type: String, required: true},
    lastName: { type: String, required: true },
    emailUser: { type: String, required: true, unique: true},
    password: { type: String, required: true},
    preferredName: { type: String, required: true},
    gender: { type: String, enum: ["Male", "Female", "Other"], required: true},
    //Validation check needed to ensure they are at least 18
    age: { type: Number, required: true},
    location: { type: String, enum: ["City Centre", "Clifton"], required: true},
    //Not sure if we need more religions?
    religion: { type: String, enum: ["Christian", "Hindu", "Muslim", "Buddhist", "Jew"], required: true},
    //Need to check this one - Not sure if country code stores the '+' 
    phoneNumber: { type: Number, required: true},
    uniCourse: { type: String, required: true},
    bio: { type: String, required: true},
    image: { data: Buffer, contentType: String, required: true},
    question1: { type: String, enum: ["Extrovert", "Introvert"]},
    question2: { type: String, enum: ["Extrovert", "Introvert"]}
});

//Creating a model from schema we've just made, and exporting it to be used elsewhere
//module.exports = mongoose.model('Users', userProfiles);
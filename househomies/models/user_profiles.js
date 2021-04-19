var mongoose = require('mongoose');

var userProfileSchema = new mongoose.Schema({
    age: { type: Number, required: true},
    bio: { type: String, required: true},
    //image: { type: Buffer, required: true},
    gender: { type: String, required: true},
    lastName: { type: String, required: true },
    location: { type: String,  required: true},
    religion: { type: String, required: true},
    firstName: { type: String, required: true},
    phoneNumber: { type: String, required: true},
    preferredName: { type: String, required: true},
    uniCourse: { type: String, required: true}
    //likes: [],
    //dislikes: []
});

//Creating a model from schema we've just made, and exporting it to be used elsewhere
module.exports = mongoose.model('userProfiles', userProfileSchema, 'User Personal Details');

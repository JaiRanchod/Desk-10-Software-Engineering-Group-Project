var mongoose = require('mongoose');

var userProfileSchema = new mongoose.Schema({
  "Age": {type: Number, required: true},
  "Bio": {type: String, required: true},
  "First Name": {type: String, required: true},
  "Image": {type: String, required: true},
  "Gender": {type: String, required: true},
  "Location": {type: String, required: true},
  "Phone Number": {type: String, required: true},
  "Preferred Name": {type: String, required: true},
  "Religion": {type: String, required: true},
  "Surname": {type: String, required: true},
  "University Course": {type: String, required: true},
  "like": {type: [mongoose.Schema.Types.ObjectId], require: true},
  "dislike": {type: [mongoose.Schema.Types.ObjectId], require: true},
  "Budget": {type: String, required: true},
  "Personality": {type: String, required: true},

});

//Creating a model from schema we've just made, and exporting it to be used elsewhere
module.exports = mongoose.model('userProfiles', userProfileSchema, 'User Personal Details');

var mongoose = require('mongoose');
var uniqueValidator = require('mongoose-unique-validator');

var userLoginSchema = new mongoose.Schema({
    email: { type: String, required: true, unique: true},
    password: { type: String, required: true}
});

userLoginSchema.plugin(uniqueValidator);

module.exports = mongoose.model('userLogins', userLoginSchema, 'Users Login Details');

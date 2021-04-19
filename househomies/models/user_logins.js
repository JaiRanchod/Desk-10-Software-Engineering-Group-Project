var mongoose = require('mongoose');

var userLoginSchema = new mongoose.Schema({
    email: { type: String, required: true, unique: true},
    password: { type: String, required: true}
});

module.exports = mongoose.model('userLogins', userLoginSchema, 'Users Login Details');
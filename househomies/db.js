/*const mongoose = require('mongoose');

const {
  MONGO_USERNAME,
  MONGO_PASSWORD,
  MONGO_HOSTNAME,
  MONGO_PORT,
  MONGO_DB
} = process.env;

const options = {
  useNewUrlParser: true,
  reconnectTries: Number.MAX_VALUE,
  reconnectInterval: 500,
  connectTimeoutMS: 10000,
};

const url = `mongodb://${MONGO_USERNAME}:${MONGO_PASSWORD}@${MONGO_HOSTNAME}:${MONGO_PORT}/${MONGO_DB}?authSource=admin`;

mongoose.connect(url, options).then(function () {
  console.log('MongoDB is connected');
})
  .catch(function (err) {
    console.log(err);
  });*/

  var mongoose = require('mongoose');
  var mongoDB = 'mongodb+srv://Jai:Jai@househomies.wmpji.mongodb.net/myFirstDatabase?retryWrites=true&w=majority';

  mongoose.connect(mongoDB, { useNewUrlParser: true, useUnifiedTopology: true}).then(function(){
    console.log('MongoDB is connected in new way');
  })
  .catch(function(err){
    console.log(err);
  });

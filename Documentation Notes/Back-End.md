<h1 align="center">Back End</h1>

<h2 align="center">MongoDB - Database Implementation</h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Originally, we followed the worksheets proivided which led to us integrating a local Mongo database. However, due to several discussions we thought it would be easier to opt for an account with Mongo. The main reason for this is because this meant matches would be retained in between builds and would lead to less issues when different users were interacting with the system at the same time. We had two collections (databases) - 1) User Login Details and 2) User Personal Details (shown below). We understand this is not the most secure system, however this is discussed further in our social and ethical discussion (hyperlink here). We altered some of the files that linked our application to a local Mongo database and connected it to our database in the cloud. We wrote our schema and then started creating documents based on this. The registration process also became a lot more streamlined and efficient when we implemented this system. Typeform and some middleware (Andreas) meant once the registration process was complete and submitted this would automatically create two documents in the Mongo space. We would store the email and password in the login details collection and then the rest of the data obtained in the personal details collection. The details for the MongoDB account can be emailed to you if required.</p>

![](https://i2.paste.pics/f99870c61058bfa183d1a7b4e2fa74c8.png)

A quick journey of the various stages of database implementation is shown here:

Originally, through the tutorials that were based on a local Mongo database.

```javascript
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

```

Revising this we were able to change it to a database that was connected to our MongoDB Atlas account, that was serving data in the cloud.

```javascript
  var mongoose = require('mongoose');
  var mongoDB = 'mongodb+srv://Jai:Jai@househomies.wmpji.mongodb.net/myFirstDatabase?retryWrites=true&w=majority';

  mongoose.connect(mongoDB, { useNewUrlParser: true, useUnifiedTopology: true}).then(function(){
    console.log('MongoDB is connected in new way');
  })
  .catch(function(err){
    console.log(err);
  });

```

<h2 align="center">Data Model</h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Through the data model documentation (link here), you can see that we have transitioned through various different schemas and data models. We ended up trying to pick something quite simple, since we knew our project was already going to be difficult to create. We initally wanted to use the "id" variable that is automatically generated as a way to call each user profile, however we realised that when we were creating these documents, the "id" was not the same for both of the documents created upon registaration. We then opted to change our data model and include "email" in both documents creating a foreign key that we could use to find the correct corresponding data. With the data model, we had a field for images, so for some of the images we had null if no image was stored and then stored the image as a string via accessing our online database. This was done for some of the pre-loaded up users, however we also had some users that uploaded their images through the typeform registration service we had provided. This image would then stored as binary, however our code was versatile enough to cope with this and still presented the images in the way that we wanted.</p>

Here we can see how the final data model is implemented in the form of code. 

1) User Logins

```javascript
var mongoose = require('mongoose');
var uniqueValidator = require('mongoose-unique-validator');

var userLoginSchema = new mongoose.Schema({
    email: { type: String, required: true, unique: true},
    password: { type: String, required: true}
});

userLoginSchema.plugin(uniqueValidator);

module.exports = mongoose.model('userLogins', userLoginSchema, 'Users Login Details');

```

2) User Profiles

```javascript
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

```
You may notice that we have three parameters when we export the model. The reason for this is because upon registering the typescript automatically creates the new documents within the respective databases, and then when we read/write to these collections we need to ensure they are being read from pre-existing collections rather than creating new ones. This was a problem at the point of implementation since we were automatically creating new collections every time we booted up the website. The third parameter we included now identifies the correct collection within Mongo, rectifying the problem. 

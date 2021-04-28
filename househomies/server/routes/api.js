const express = require('express');
const router = express.Router();

const userLogins = require('../../models/user_logins');
const userProfiles = require('../../models/user_profiles');

/* GET api listing. */
router.get('/', (req, res) => {
  res.send('api works');
});

router.get('/UserLogins', (req, res) => {
  const loginInfo = req.body;
  userLogins.find(loginInfo, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  });
});

/*router.post('/UsersLogins', (req, res, next) => {
  userLogins.findOne({ email: req.body.email })
  .then(user => {
    if(!user) {
      res.status(401).send(err);
    } else {
      res.status()
    }
  });
});*/

router.get('/UserProfiles', (req, res) => {
  const userInfo = req.body;
  userProfiles.find(userInfo, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  });
});

router.post('/UserProfilesLike', (req, res) => {
  //the current user is in the query string of the request
  let user_id = req.query._id;
  //the disliked user id is sent as the body in json format
  let match_id = req.body._id;
  userProfiles.updateOne(
    {_id: user_id},
    { $push: {like: match_id }},
    (err, update_resp) => {
      if(err){
        res.status(500).send(err);
      }else{
        res.status(201).send(update_resp);
      }
    },
  );
});

//set the route for userProfileDislike api call
router.post('/UserProfilesDislike', (req, res) => {
  //the current user is in the query string of the request
  let user_id = req.query.id;
  //the disliked user id is send as the body in json format
  let match_id = req.body._id;
  userProfiles.updateOne(
    {_id: user_id},
    { $push: {like: match_id }},
    (err, update_resp) => {
      if(err){
        res.status(500).send(err);
      }else{
        res.status(201).send(update_resp);
      }
    },
  );
});

//resets the likes and dislikes inthe database
router.post('/UserProfilesLikeDislikeReset', (req, res) => {
  userProfiles.updateMany(
    {},
    { like: [], dislike: []},
    (err, update_resp) => {
      if(err){
        res.status(500).send(err);
      }else{
        res.status(201).send(update_resp);
      }
    },
  );
});

router.get('/UserLogins/:Email', (req, res) => {
  userLogins.find({Email: req.params.Email}, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  })
})

router.get('/UserProfiles/:Email', (req, res) => {
  userProfiles.find({Email: req.params.Email}, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  })
})



module.exports = router;

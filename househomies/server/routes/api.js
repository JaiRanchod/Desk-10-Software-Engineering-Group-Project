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

module.exports = router;
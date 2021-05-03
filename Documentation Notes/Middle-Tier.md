<h1 align="center">Middle Tier</h1>

<h2 align="center">Express</h2>

Express JS is a framework used to develop web application in Node. Express has allowed us to make requests to our Mongo database and return the appropriate response. 
In the server.js file we see that we are initialising the Express app object meaning we can handle various requests from different clients successfully. The APP also uses ‘Bodyparser’ which means that whenever a POST request is made, it will automatically convert this into a JSON format and lead to less future errors occurring. 

For some more examples of how we have made best use of this – see the RESTful API section below. 

<h2 align="center">Node</h2>

Node.js is a server-side JavaScript execution environment. This means it handles the client and server requests. Once we ran Node this allowed our RESTful API (discussed below) to be connected to Mongo. The Node server listens for HTTP requests and responses and is built on top of the Express framework previously discussed. 

<h2 align="center">Restful API</h2>

The RESTful API allows us to make HTTP requests to access and use data. We can use various methods such as the GET, PUT, POST and DELETE to manipulate the data as we deem necessary. We used various GET and POST methods to call and store the data we needed. The first GET request we make is when the user tries to log in and we make a request based on the email they use. This email then finds the appropriate record and checks to ensure that the email address and password are correct for login verification purposes. Now, that we have found a correct email address and correct user ID, we can then store this and use this to base our future GET requests.

```javascript
public getAll2(userEmail){
    let tmp = this.REST_API_SERVER2;
    tmp = tmp + "/" + userEmail;
    console.log("GETTING " + tmp);
    return this.httpClient.get(tmp)
  }

```

```javascript
router.get('/UserLogins/:Email', (req, res) => {
  userLogins.find({Email: req.params.Email}, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  })
})

```

```javascript
public getAll(){
    console.log("UNDEFINED HERE. IS THIS WORKING? "  + this.REST_API_SERVER);  
    return this.httpClient.get(this.REST_API_SERVER + this.slash + this.email);
  }

```

```javascript
router.get('/UserProfiles/:Email', (req, res) => {
  userProfiles.find({Email: req.params.Email}, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  })
})

```


Since we load up the matches screen after logging in. We issue a GET request through the identification method of using the email we just found to identify the user profile and identify the matches they have. This then allows us to implement a for loop which displays all the matches for the user. 

When we visit the profile page, we use the email address as an identification method to submit a GET request for the correct information displayed for this user. Similarly, this is also done for the profile edit page. However, when the user is done editing their profile page, upon pressing the save button the program submits a POST request to their profile and changes the fields accordingly. 

```javascript
router.get('/UserProfiles/:Email', (req, res) => {
  userProfiles.find({Email: req.params.Email}, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  })
})

```

```javascript
post_update(cur_id: string, newPreferredName: string, newLocation: string, newGender: string, newAge: string, newPhoneNumber: string, newUniCourse: string, newBio: string, newFirstName: string, newLastName: string, newReligion: string, newBudget: string, newPersonality: string){
    return this.http.post('/api/UserProfilesUpdate' + "/" + cur_id, {
      "PreferredName": newPreferredName,
      "Age": newAge,
      "Bio": newBio,
      "Gender": newGender,
      "Location": newLocation,
      "UniversityCourse": newUniCourse,
      "PhoneNumber": newPhoneNumber,
      "FirstName": newFirstName,
      "LastName": newLastName,
      "Religion": newReligion,
      "Budget": newBudget,
      "Personality": newPersonality,
    }, {params: {_id: cur_id}})
  }

```

```javascript
router.post('/UserProfilesUpdate/:id', (req, res) => {
  userProfiles.updateOne({_id: req.params.id}, {
    "Preferred Name": req.body.PreferredName,
    Age: req.body.Age,
    Bio: req.body.Bio,
    Gender: req.body.Gender,
    "University Course": req.body.UniversityCourse,
    Location: req.body.Location,
    "Phone Number": req.body.PhoneNumber,
    "First Name": req.body.FirstName,
    Surname: req.body.LastName,
    Religion: req.body.Religion,
    Budget: req.body.Budget,
    Personality: req.body.Personality,
  }, (err, data) => {
    if(err){
      res.status(500).send(err);
    } else {
      res.status(201).send(data);
    }
  })
})

```

On the homepage, we will need to update their profile every time the user decides they like or dislike someone. This means a POST request is issued and the profile is updated accordingly (found using the current user ID). We then push the ID of the profile they are currently viewing into an array of likes or dislikes based on what they chose. 

```javascript
post_like(match_id: string, cur_id: string){
    return this.http.post('/api/UserProfilesLike', {"_id": match_id}, {params: {_id: cur_id}}) 
  }

```

```javascript
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

```

References

https://www.guru99.com/mean-stack-developer.html#:~:text=Mean%20Stack%20refers%20to%20a,used%20to%20develop%20web%20applications.&text=Express%20JS%20is%20a%20framework,Node.

https://searchapparchitecture.techtarget.com/definition/RESTful-API#:~:text=A%20RESTful%20API%20is%20an,deleting%20of%20operations%20concerning%20resources. 

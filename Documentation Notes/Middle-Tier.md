<h2 align="center">iddle Tier</h2>

Express

Express JS is a framework used to develop web application in Node. Express has allowed us to make requests to our Mongo database and return the appropriate response. 
In the server.js file we see that we are initialising the Express app object meaning we can handle various requests from different clients successfully. The APP also uses ‘Bodyparser’ which means that whenever a POST request is made, it will automatically convert this into a JSON format and lead to less future errors occurring. 

For some more examples of how we have made best use of this – see the RESTful API section below. 

Node 

Node.js is a server-side JavaScript execution environment. This means it handles the client and server requests. Once we ran Node this allowed our RESTful API (discussed below) to be connected to Mongo. The Node server listens for HTTP requests and responses and is built on top of the Express framework previously discussed. 

RESTful API

The RESTful API allows us to make HTTP requests to access and use data. We can use various methods such as the GET, PUT, POST and DELETE to manipulate the data as we deem necessary. We used various GET and POST methods to call and store the data we needed. The first GET request we make is when the user tries to log in and we make a request based on the email they use. This email then finds the appropriate record and checks to ensure that the email address and password are correct for login verification purposes. Now, that we have found a correct email address and correct user ID, we can then store this and use this to base our future GET requests.

Need to put some code examples in. 

Since we load up the matches screen after logging in. We issue a GET request through the identification method of using the id to identify the user profile and identify the matches they have. This then allows us to implement a for loop which displays all the matches for the user. 

When we visit the profile page, we use the email address as an identification method to submit a GET request for the correct information displayed for this user. Similarly, this is also done for the profile edit page. However, when the user is done editing their profile page, upon pressing the save button the program submits a POST request to their profile and changes the fields accordingly. 

Code examples here. 

On the homepage, we will need to update their profile every time the user decides they like or dislike someone. This means a POST request is issued and the profile is updated accordingly (found using the current user ID). We then push the ID of the profile they are currently viewing into an array of likes or dislikes based on what they chose. 

Code example here.    

References

https://www.guru99.com/mean-stack-developer.html#:~:text=Mean%20Stack%20refers%20to%20a,used%20to%20develop%20web%20applications.&text=Express%20JS%20is%20a%20framework,Node.
https://searchapparchitecture.techtarget.com/definition/RESTful-API#:~:text=A%20RESTful%20API%20is%20an,deleting%20of%20operations%20concerning%20resources. 

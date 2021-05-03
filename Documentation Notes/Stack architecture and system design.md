<h1 align="center"> <b> Stack Architecture and System Design </b> </h1>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;Before we dive into the details of our each of components that make up our project, let us take a look at an overview of a MEAN Stack application and why we use it.</p>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;<b>MEAN</b> is an open-source JavaScript software stack. The acronym representing a collection of four technologies and the combination of the 
four cater to the complex demands needed by the applications built by developers.</p>

<h2 align="center">Mongo</h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;<b>MongoDB</b> acts as the back-end of our web application, where all the data will be stored. It is a NoSQL database so it uses collections 
and documents. This allows for easy handling of lots of data and it is also scalable, it can also facilitate adding fields to the databasd without the 
need to reload the entire table. The JSON documents created in our angular front-end can be sent to Express where they are processed and stored in 
MongoDB. Because the database and the application use JavaScript, MongoDB eliminates the underlying need for translation once the object moves to the 
database from the app.</p>

<h2 align="center">Express</h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;<b>Express</b> works with Node.js and assists in the management of interactions between the front-end and the back-end, smoothing out the process of data transfer. Express.js calls itself a “fast, unopinionated, minimalist web framework for Node.js,” and that is indeed exactly what it is. Allowing an more efficient and easier process for app developers to write modular and create fast and secure apps.</p>

<h2 align="center">Angular</h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;<b>Angular</b> is the front-end component of the MEAN Stack which works with JavaScript, that is highly popular within the software developer community. Websites such as Forbes, Paypal and GMail use an angular framework for the user-facing side of their web application. Angular allows you to extend your HTML tags with metadata as it contains lots of templates and components, so it allows to develop single-page and dynamic web apps quickly. As Angular uses JavaScript it allows a smooth flow of data among all parts of the web application.</p>

<h2 align="center">Node.js</h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;<b>Node.js</b> forms the backbone of the MEAN stack, it is efficient and flexible which helps it run browsers apart from JavaScript applications. The scalability is a great feature of Node.js as it can support millions of simultaneous connections. Node.js connects with the front-end and back-end and passes information between them acting as the 'middle-tier' with Express. Node.js has an inbuilt web server, which makes it easier for you to deploy the MongoDB database to the cloud.</p>

<h2 align="center">So why use a MEAN Stack Application</h2>

- MEAN Stack enables developers to create a simple and open-source solution. Developers need to know only one programming language, which is JavaScript. 
- The components are all open-sourced and free.
- MEAN Stack is highly flexible during web application development as it is quick and easy to add new components of the web application while developing 
or post-development.
- Easier developing, testing, and deploying phases of the application with MEAN Stack.

We have created some class diagrams below, however creating a class diagram for the whole application became quite complex and we struggled to find a piece of software that would do it for us.

![Screenshot 2021-05-03 170225](https://user-images.githubusercontent.com/73884031/116901045-5be45e00-ac31-11eb-9472-021655170f5f.png)

![image](https://user-images.githubusercontent.com/73884031/116901085-6bfc3d80-ac31-11eb-93ee-95c18ff8addc.png)

The two images above work very close together. Results is an event emitter that tells the homepage component whether the user likes or dislikes the user they are currently viewing. Choose_yes is for when a like occurs and choose_no is for a dislike. On results is a method that is called with the parameter of a like/dislike (in the form of an event). Based on this parameter, we then push the user they are viewing into the logged in users likes array. The choose_cards methods are related to the fact that when a user likes/dislikes another user, we need another user to appear until they have gone through all the profiles. 

![image](https://user-images.githubusercontent.com/73884031/116901157-7d454a00-ac31-11eb-9d4b-564115fd5906.png)

Using a profile interface was something we soon realised would become incredibly helpful. This could be used in various instances, avoiding having to repeat code. It rectified the problem that you can see in the profile component where we have to set all the components manually, making it more time-consuming. We have included both of these to show that whilst we were working on the project we were still looking at ways to make the code more efficient and professional. 

![image](https://user-images.githubusercontent.com/73884031/116901277-9fd76300-ac31-11eb-8322-4fc49d68f577.png)

The matches component provides the visual of who the current user has matched with when using our platform. Matches is set to get all the matches for this user and the profiles array means all of these profiles can be used on one page. These arrays mean we can use a for loop within the HTML to dynamically get all the users that have matched with the logged in user. Retrieve data is similar to the method described in the profiles component and the get matches component goes through the array within the database and sets the arrays within the current file. 

![image](https://user-images.githubusercontent.com/73884031/116901330-b1b90600-ac31-11eb-9b4f-61d345489cba.png)

The profile component was one of the initial components we had developed and you can see we did not use the profile interface in this which meant we had to include all the fields of the profile making our code look more messy than what we would have hoped. Retrieve data (shown below) is the main function that is called in this typescript file and sets all the variables so they can be used within the HTML. 

```javascript
retrieveData() {
        this.dataService.getAll().subscribe(
            data => {
              console.log(data);
              this.stats = data;
              // now let's update the fields
              this.firstName = this.stats[0]["First Name"];
              this.image = this.stats[0].Image;
              console.log("Hi " + this.firstName);
              this.lastName = this.stats[0].Surname;
              this.location = this.stats[0].Location;
              this.fullName = this.firstName + " " + this.lastName;
              this.preferredName = this.stats[0]["Preferred Name"];
              this.gender = this.stats[0].Gender;
              this.religion = this.stats[0].Religion;
              this.age = this.stats[0].Age;
              this.phoneNumber = "+" + this.stats[0]["Phone Number"];
              this.uniCourse = this.stats[0]["University Course"];
              this.bio = this.stats[0].Bio;
              this.personality = this.stats[0].Personality;
              this.budget = this.stats[0].Budget;
            },
            error => {
              console.log(error);
            });
        }
        
```







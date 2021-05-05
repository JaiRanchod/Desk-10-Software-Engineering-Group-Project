 <h1 align="center"> Software-Engineering-Group-Project </h1>

<p align="center"> HouseHomies - Finding you the right homies for your home </p>

<p align="center">
  <img src="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/househomies.png">
</p>

<p align="center"> Welcome to Desk 10's GitHub repo we hope you enjoy going through our project as much as we did making it! </p>
<br>

<p align="center"> <b>Team Members</b> </p>

<p align="center"> Jai Ranchod, Josh Pears, Charles Hilton, Andreas Phillipou and Lucas MacKenzie </p>

<p align="center">
  <img src="https://i.ibb.co/6B9N28m/Profile.jpg" width="150" height="150"/>
  <img src="https://i.ibb.co/1m5frKk/Screenshot-2021-05-05-at-12-01-33.png" width="150" height="150"/> 
  <img src="https://i.ibb.co/Q6tB28R/Screenshot-2021-05-05-at-12-03-34.png" width="150" height="150"/>
 <img src="https://i.ibb.co/MN1M4zz/Screenshot-2021-05-05-at-12-04-00.png" width="150" height="150"/> 
  <img src="https://i.ibb.co/4jXdXvm/Screenshot-2021-05-05-at-12-02-28.png" width="150" height="150"/>
</p>


<h2 align="center"> <b> Introduction </b> </h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;For our project, we established the problem of looking for housing with a suitable group of friends. Sometimes, this can occur due to people dropping out and needing another person to fill in. Other times it may be that there are people unhappy with their current living situation and looking to move to a happier and more enjoyable situation. </p>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;Currently, the majority of university students who do not have a house sorted use Facebook pages to find a room or other people to bunch up to find a house together. We see that most people either turn to the Clifton and Stoke Bishop Facebook page or alternative housing Facebook groups designed to help people find suitable accommodation. The problems with these pages are that they can be unorganized, making it hard to track what users have seen and what users are yet to see. </p>

<p align="left"> So we have decided to create a tinder-like app for people to find like-minded housemates. It will feature a swipe action when liking or disliking user profiles, a pop-up action when a match is made and the user will be able to see their matches on a matches page.</p>

<p align="center">
  <img src="https://media.giphy.com/media/w2KHfIlI3V7bi/giphy.gif" width="200" height="200">
</p>

 <p align="center">
  <b> Introduction links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Project%20Brief.md">Project Brief</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Initial%20Ideas.md">Initial Ideas</a> |
  <a href="https://youtu.be/J7W7AVbA9sw">Introduction Video</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Scope%20of%20Project.md">Scope of Project</a>
  <br><br>
</p>

<!-- https://user-images.githubusercontent.com/73884031/116811748-d2566280-ab42-11eb-8fb7-35dbf0301b24.mp4 -->

<h2 align="center"> <b> Background and Motivation </b> </h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;The identification of our problem came from personal experience, in which some team members had decided to do the Computer Science MSc later than usual, this meant most of the flats/houses had been taken and friends that were staying another year had already signed housing agreements. This left some of our team members in the position of having to find a spare room or people to live with they previously did not know. </p>

<p align="left"><p>&nbsp;&nbsp;&nbsp;&nbsp;Although there are some well-established websites/pages, such as Spareroom and Clifton Stoke Bishop Tickets, we found that these were dull to use and often inefficient in finding like-minded housemates. We looked to Tinder to incorporate the playful aspect for this project, we thought the swiping element would be fun in searching through profiles, rather than scrolling through a page that could contain up to hundreds of profiles. Our method of swiping through users will also mean the user will be able to see all available users so there would be no chance of skipping past profiles that you might have otherwise looked past. Our method also means that all of the user's information will be displayed when the user is looking through profiles whereas other websites/pages rely on the user clicking on a user's profile to see all their information which can be inefficient and you may misjudge someone before you can see their complete profile. </p>

<p align="center">
  <img src="https://media.giphy.com/media/iIGuFo7k5UqAe9cH0N/source.gif" width="200" height="200">
</p>

<p align="center">
  <b> Background and Motivation links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Current%20Industry%20Review.md">Current Industry Review</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Clear%20definition%20of%20our%20problem.md">Clear definition of our problem</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Background%20Literature.md">Background Literature</a>
  <br><br>
</p>



<h2 align="center"> <b> System Implementation </b> </h2>

<p align="left"><p>&nbsp;&nbsp;&nbsp;&nbsp;For our single page application, we used the MEAN Stack approach which uses MongoDB, Express, Angular and 
Node.js. MongoDB forms the back-end of the application and it makes it easy to pass data between the client and server by saving data in binary JSON 
format. It provides high performance, high availability, and easy scalability because it is a cross-platform, document-oriented database. Express 
provides the web development framework, it provides a robust set of features for web and mobile applications; it is a minimal and flexible Node.js web 
application framework. Angular is the front-end aspect of the web application, it provides easy-to-use templates and eliminates much of the unwanted 
code which otherwise we would have written with its feature of data binding and dependency injection. It uses HTML, CSS and SCSS to style the front-end. 
Node.js acts as the backbone and Express was specifically developed to work on top of Node.js. Angular can connect seamlessly to Node.js so allows for 
fast deployment of our web application. These four components work together well as they all run Javascript, so there is no need to learn several 
programming languages.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;We used Docker to create, deploy, and run instances of our web application by using containers. Containers allowed us as a 
team to package up an application with all of the necessary parts, such as libraries and other dependencies. It deploys it as one package. Thanks to 
'containerizing', as a team we could be rest assured that the application would run on any other Linux systems no matter what operating system or 
machine they were using.</p>


<p align="center">
  <img src="https://media.giphy.com/media/fwbZnTftCXVocKzfxR/source.gif" width="200" height="200">
</p>


<p align="center">
  <b> System Implementation links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Stack%20architecture%20and%20system%20design.md">Stack architecture and system design</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Back-End.md">Back-End</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Middle-Tier.md">Middle-Tier </a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Front-End.md">Front-End</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Additional%20elements%20and%20components.md">Additional elements and components</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Deployment%20details.md">Deployment details</a>
  <br><br>
</p>


<h2 align="center"> <b> UX Design </b> </h2>

<p align="left"> In designing our web application we used a variety of different methods in coming up with the design of our web application. We started with paper prototyping and then developed a wireframe using Figma. We found using Figma an efficient method in formulating the design of the web application as we could all simultaneously work on the application and Figma allowed us to create a 'working' version of the website design where we could embed links between pages so we could get a feel for how the website will work. We discuss, in detail, the specifics of our design process in the links below. </p>

<p align="center">
  <img src="https://media.giphy.com/media/YBkTzzyNewWtUANTso/source.gif" width="200" height="200">
</p>

<p align="center">
  <b> UX Design links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Design%20Process.md">Design Process</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Identification%20of%20interacting%20users%20and%20broader%20stakeholders.md">Identification of interacting users and broader stakeholders</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/UX%20approach.md">UX approach</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Understanding%20of%20user%20group.md">Understanding of user group</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Wireframes%20and%20interaction%20flow%20diagrams.md">Wireframes and interaction flow diagrams</a>
  <br><br>
</p>



<h2 align="center"> <b> Sprints and Project Management </b> </h2>

<p align="left"><p>&nbsp;&nbsp;&nbsp;&nbsp;In this section, we discuss how we did our sprints and how we managed the team. We appointed Josh as our 'team leader' to organise meetings and be the point of call if any of the team members needed any guidance with the project, although most of us were pretty independent in the allocated work we were assigned. We will discuss how we approached communication within the team and how this was affected by the pandemic, our working practices as well as our use of GitHub.</p>

<p align="center">
  <img src="https://media.giphy.com/media/111GaZJtUrzC4o/source.gif" width="200" height="200">
</p>

 

<p align="center">
  <b> Sprints and Project Management links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Group%20Working%20Methods.md">Group Working Methods</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Team%20Roles.md">Team Roles</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Meeting%20Notes%20and%20Sprint%20Documentation.md">Sprint Documentation</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Team%20Use%20of%20GitHub.md">Team use of GitHub</a>
  <br><br>
</p>



<h2 align="center"> <b> Evaluation </b> </h2>

<p align="left"> In evaluating our project we look to evaluate our design looking at what features worked well and which not so much, and what we should have changed in the design of the web application. We conducted a user acceptance test of five users to see get feedback on the design and functionality of the web application. </p>

<p align="center">
  <img src="https://media.giphy.com/media/xT5LMLcvRrCS5Nf2Lu/source.gif" width="200" height="200">
</p>

<p align="center">
  <b> Evaluation links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Design%20Evaluation.md">Design Evaluation</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/testing.md">Unit testing/Functional testing</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/User%20Acceptance%20Testing.md">User Acceptance Testing</a> 
  <br><br>
</p>



<h2 align="center"> <b> Conclusion </b> </h2>

<p align="left"> In this section we look to draw some conclusions from our project, reflecting on the final version of our project and also factors that affected the process of building the application. We concluded that this project could be taken a lot further if we had more time and we could learn how to implement some more advanced features for the application. So we may continue working on the idea, following the submission of this version. </p>

<p align="center">
  <img src="https://media.giphy.com/media/rSVRXeKPgeM5xfGyCR/source.gif" width="200" height="200">
</p>



<p align="center">
  <b> Conclusion links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Working%20Practices%20Reflection.md">Working Practices Reflection</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Reflection%20on%20success%20of%20project.md">Refelction on success of the project</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Social%20and%20Ethical%20Implications.md">Social and Ethical implications</a>|
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Coronavirus%20Discussion.md">Coronavirus Discussion</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Future%20Work.md">Future Work</a>
  <br><br>
</p>


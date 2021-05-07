 <h1 align="center"> Software-Engineering-Group-Project </h1>

<p align="center"> HouseHomies - Finding you the right homies for your home </p>


<p align="center">
  <img src="https://i.ibb.co/Tr0C935/househomies.png" alt="househomies" border="0">
</p>

<p align="center"> Welcome to Desk 10's GitHub repo we hope you enjoy going through our project as much as we did making it! </p>
<br>

<p align="center">
  <img src="https://media.giphy.com/media/w2KHfIlI3V7bi/giphy.gif" width="200" height="200">
</p>

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

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;HouseHomies is a single page web app designed to support University of Bristol students in finding suitable housemates. As a group of individuals with the majority being in their fourth year at Bristol, we understand how flatmates can make or break your experience. Having a difficult home environment adds to students already mounting stress problems, reflected in the student mental health crisis.</p>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;Many alternatives such as Facebook pages or apps lack the emphasis on creating a happy and healthy household, with more focus on the room itself, being riddled with adds. Our app provides its users with key information that they would want when looking for housemates as well as providing it in a fun and engaging way. Using mechanisms from dating apps such as Tinder who have shown great success with swiping profile cards, we implement this in our students search for housemates. </p>

[![IMAGE ALT TEXT HERE](https://img.youtube.com/vi/J7W7AVbA9sw/0.jpg)](https://www.youtube.com/watch?v=J7W7AVbA9sw)

https://user-images.githubusercontent.com/73884031/116811748-d2566280-ab42-11eb-8fb7-35dbf0301b24.mp4



<h3 align="left"><b> Project Objectives: </b> </h3>


<p>&nbsp;&nbsp;&nbsp;&nbsp;Our project had a focus on the relationship between cohabitants, creating an efficient way to find compatible housemates, with the following objectives:
  
* Create a single page web app for students, aiding in their search for housemates, using mechanics similar to those seen in dating apps such as Tinder.
  
* Ensure relevant information is presented in a structured format, allowing users to make more informed decisions on candidate housemates.

* Reduce conflict and improve cohabiting relations. With hopes of enriching the university experience while also providing a strong and readily available support network during the current student mental health crisis.

* Bring more engagement and efficiency in the arduous task of finding flatmates through the use of gamification.</p>
 

<!-- https://user-images.githubusercontent.com/73884031/116811748-d2566280-ab42-11eb-8fb7-35dbf0301b24.mp4 -->

<h2 align="center"> <b> Background and Motivation </b> </h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;The identification of our problem came from personal experience, many team members chose to do their Computer Science Msc over summer. By this time many people had already signed for houses, leaving previous housemates and friends from undergrad no longer an option. This is a common theme across our course with many people resorting to finding spare rooms and living with people they previously didn't know. </p>

<p align="left"><p>&nbsp;&nbsp;&nbsp;&nbsp;Although there are some well-established websites/pages such as Spareroom and Clifton Stoke Bishop Tickets, we found these were dull to use and plagued with advertisements, making it inefficient for finding potential housemates. The swiping aspect of apps such as Tinder seemed like a fun and efficient way to search through profiles, rather than scrolling through a page that could contain hundreds of profiles. Our method of swiping through users will also mean the users won't be able to skip a profile that they may otherwise have overlooked. This method also means that all of a users's information will be displayed in one place whereas other websites/pages rely on the user clicking on a user's profile to see all their information which can be inefficient may result in more misjudged profiles.</p>

<p align="center">
  <img src="https://media.giphy.com/media/iIGuFo7k5UqAe9cH0N/source.gif" width="200" height="200">
</p>

<p align="center">
  <b> Background and Motivation links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Current%20Industry%20Review.md">Current Industry Review</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Clear%20Definition%20of%20Our%20Problem.md">Clear definition of our problem</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Background%20Literature.md">Background Literature</a>
  <br><br>
</p>



<h2 align="center"> <b> System Implementation </b> </h2>

<p align="left"><p>&nbsp;&nbsp;&nbsp;&nbsp;For our single page application, we used the MEAN Stack approach which uses MongoDB, Express, Angular and 
Node.js. MongoDB forms the back-end of the application allowing data to easily be passed between the client and server, saving data in binary JSON 
format. It provides high performance, high availability, and easy scalability because it is a cross-platform, document-oriented database. Express 
provides the web development framework, it supplies a robust set of features for web and mobile applications; it is a minimal and flexible Node.js web 
application framework. Angular is the front-end aspect of the web application, providing easy-to-use templates and eliminating much of the excess 
code which would have to be written if not for its feature of data binding and dependency injection. It uses HTML, CSS and SCSS to style the front-end. 
Node.js acts as the backbone and Express was specifically developed to work on top of Node. Angular can connect seamlessly to Node so allows for 
fast deployment of our web application. These four components work together and create a more convenient working environment as they all run Javascript, removing the need to learn several programming languages.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;We use Docker to create, deploy, and run instances of our web application through the use of containers. Containers allowed our 
team to separate our application from its infrastructure. This meant we could easily deploy and test code. Thanks to docker we could be confident our application would run on any other systems, regardless of OS or environment.</p>


<p align="center">
  <img src="https://media.giphy.com/media/fwbZnTftCXVocKzfxR/source.gif" width="200" height="200">
</p>


<p align="center">
  <b> System Implementation links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Stack%20Architecture%20and%20System%20Design.md">Stack architecture and system design</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Back%20End.md">Back-End</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Middle%20Tier.md">Middle-Tier </a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Front%20End.md">Front-End</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Additional%20Elements%20and%20Components.md">Additional elements and components</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Deployment%20Details.md">Deployment details</a>
  <br><br>
</p>


<h2 align="center"> <b> UX Design </b> </h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;The design process of our application consisted of a variety of different methods in coming up with the design of our web application. We started with paper prototyping and then developed a wireframe using Figma. We found using Figma an efficient method in formulating the design of the web application as we could  simultaneously work on the application. Figma allowed us to create a 'working' version of the website design where we could embed links between pages to get a feel for how the website will work and allow for some basic testing feedback. We discuss, in detail, the specifics of our design process in the links below. </p>

<p align="center">
  <img src="https://media.giphy.com/media/YBkTzzyNewWtUANTso/source.gif" width="200" height="200">
</p>

<p align="center">
  <b> UX Design links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Design%20Process.md">Design Process</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Identification%20of%20Interacting%20Users%20and%20Broader%20Stakeholders.md">Identification of interacting users and broader stakeholders</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/UX%20Approach.md">UX approach</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Understanding%20of%20User%20Group.md">Understanding of user group</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Wireframes%20and%20Interaction%20Flow%20Diagrams.md">Wireframes and interaction flow diagrams</a>
  <br><br>
</p>



<h2 align="center"> <b> Sprints and Project Management </b> </h2>

<p align="left"><p>&nbsp;&nbsp;&nbsp;&nbsp;In this section, we discuss how we carried out our sprints and how we managed the team. We appointed Josh as our 'team leader' to organise meetings and be the point of call if any of the team members needed any guidance with the project, although most of us were pretty independent in the allocated work we were assigned. We will discuss how we approached communication within the team and how this was affected by the pandemic, our working practices as well as our use of GitHub.</p>

<p align="center">
  <img src="https://media.giphy.com/media/111GaZJtUrzC4o/source.gif" width="200" height="200">
</p>

 

<p align="center">
  <b> Sprints and Project Management links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Group%20Working%20Methods.md">Group Working Methods</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Team%20Roles.md">Team Roles</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Meeting%20Notes%20and%20Sprint%20Documentation.md">Sprint Documentation</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Team%20Use%20of%20Github.md">Team use of GitHub</a>
  <br><br>
</p>



<h2 align="center"> <b> Evaluation </b> </h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;In evaluating our project we look to evaluate our design, reviewing which features worked well and which not so much. We also considered any changes that should have been made in the design of our web application. We conducted a user acceptance test of five users to gain feedback on the design and functionality of the web application. </p>

<p align="center">
  <img src="https://media.giphy.com/media/xT5LMLcvRrCS5Nf2Lu/source.gif" width="200" height="200">
</p>

<p align="center">
  <b> Evaluation links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Design%20Evaluation.md">Design Evaluation</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Unit%20and%20Functional%20Testing.md">Unit testing/Functional testing</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/User%20Acceptance%20Testing.md">User Acceptance Testing</a> 
  <br><br>
</p>



<h2 align="center"> <b> Conclusion </b> </h2>

<p align="left">&nbsp;&nbsp;&nbsp;&nbsp;In this section we look to draw some conclusions from our project, reflecting on the final version of our project and also factors that affected the process of building the application. We concluded that this project could be taken a lot further if we had more time and we could learn how to implement some more advanced features for the application. So we may continue working on the idea, following the submission of this version. </p>

<p align="center">
  <img src="https://media.giphy.com/media/rSVRXeKPgeM5xfGyCR/source.gif" width="200" height="200">
</p>



<p align="center">
  <b> Conclusion links:</b><br>
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Working%20Practices%20Reflection.md">Working Practices Reflection</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Reflection%20on%20Success%20of%20Project.md">Reflection on the success of the project</a> |
  <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Social%20and%20Ethical%20Implications.md">Social and Ethical implications</a>|
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Coronavirus%20Discussion.md">Coronavirus Discussion</a> |
 <a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Future%20Work.md">Future Work</a>
  <br><br>
</p>

<h1 align="center">Wireframes and Interaction Flow Diagrams</h1>


<p>&nbsp;&nbsp;&nbsp;&nbsp;Once the initial wireframe had been created, it was distributed to a small number of users (mainly students at the University of Bristol) for a design and functionality review. The feedback was generally very positive. However because of this, could be deemed as biased since it all came from friends of the team members, who were likely to give a biased positive response. In our evaluation and reflection, the team decided if more time or resources were available, it would have been more informative to distribute the wireframe to a wider demographic, who would have potentially been more critical and provided more informative feedback. Furthermore, since the design has evolved so much since the initial wireframe, it would be a good idea to distribute the updated design to users for more relevant feedback. If the team has time before submission, this will be done so that the design can be improved if there is time, or at least some more user feedback can be considered in the evaluation or as potential ideas discussed in the Future Work section of the documentation.</p>

<h2 align="center">Wireframes</h2>

<h2 align="center">Original Wireframe Sketch</h2>
  
  ![image](https://user-images.githubusercontent.com/74371711/117008417-9bb74e00-ace2-11eb-91e3-0fdea60f757d.png)
  
<p>&nbsp;&nbsp;&nbsp;&nbsp;The original wireframe prototype has significant differences in design from the final product. This is mainly due to our decision to base the final design on an Angular template. Other factors include the front end team exploring and discovering which elements of the design process was feasible in terms of resources available.
 
We also took into account user feedback from our wireframe testing. Despite these design changes, the functionality of the application has, for the most part, remained consistent since the start of the project 

To accommodate for changes on the way, an updated wireframe was later created as a reference for front end code development and as a means to accumulate user feedback information..</p>



<h2 align="center">Updated Wireframe Sketch</h2>

![image](https://user-images.githubusercontent.com/74371711/117008729-ee910580-ace2-11eb-8355-0b66f0026af6.png)

<p>&nbsp;&nbsp;&nbsp;&nbsp;As discussed in the 'Front End' section of the documentation, the decision to use a template from the Argon website (https://demos.creative-tim.com/argon-design-system-angular) came in early March, when the team decided it would save time wasted on making the site look 'aesthetically pleasing, and so instead of trying to code an Angular project from scratch, the team integrated the template files and began to build classes and components within that. This was initially confusing trying to work out the function of every file within the template, but after many hours of scanning through the project the pieces began to come into place and the team were able to begin implementing desired features within the HTML, stylesheet and typescript files of the template. Many ideas of what the site would look like evolved other the course of the coding as expectations were managed with the reality of the teams' limited software development skills/experience and the relatively short timeframe in which we had to complete this project. An example of this was removing the option to upload and view more than one display picture due to complications arising in both front and back end development.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Throughout the progression of the coded design implementation, HTML, CSS, SCSS and typescript files were used to create new and edit existing components. By using the pre-made SCSS styling configurations in HTML classes, we were able to keep the final design simple, consistent and visually appealing whilst ensuring a pleasant user experience.</p>

<br>

<h2 align="center">Wireframe Testing</h2>

<p><b>Here are few cases of where we able to test our paper prototype and wireframe.</b></p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Our testing process was to arrange zoom calls and discuss how the wireframe would work. Due to various situations, we decided to meet with people we were living with or arrange zoom calls to present a working wireframe. For people we saw in person we were able to just hand over our laptops and allow them to use the app in whatever way they saw fit. For zoom calls, we shared screens and were able to give the users control of the mouse meaning they were able to, again allowing users to use the app in whatever way they saw fit. After users had the opportunity of using the app, we then asked for feedback on what they thought worked well and not so well.</p>

<h3 align="center">Overview of Test Cases:</h3>

<h3 align="center">User 1 – Current Student (Potential user)</h3>

<p>&nbsp;&nbsp;&nbsp;&nbsp;This user is currently living in private accommodation. Their flatmate (user 2) has recently dropped out. This user is a good person to use for testing since it shows the perspective of trying to find a new flatmate for their current flat.</p>

<h4>Positives</h4>

- The concept is a good idea, since it solves the current problem, I am in.
- I also like the fact it tries to match the current flat to a potential new flatmate as this would provide a good flat atmosphere.
- I like the tinder styling; it is very easy to use.

<h4>Potential Issues/Improvements</h4>

- Maybe try and allow users to add their social media pages to their profile. Can provide a useful resource.
- Superlike function – Would be quite useful if you were in quite a rush.
- Maybe allow for more than one photo if that is already not an option?
- What have we done to address this?
- We have suggested users to add some social media information in their bio.

<h4>What have we done to address this?</h4>

- We have made it more clear in our wireframe that more than one picture is permitted within the profile

<h3 align="center">User 2 – Recently decided to leave Uni (Potential user)</h3>

<p>&nbsp;&nbsp;&nbsp;&nbsp;This user has decided to leave midway through University for personal reasons. They are currently still paying for their accommodation as they are finding it quite hard to let it out to someone. This user lives with user 1. For similar reasons to user 1, they are a good person to use for testing.</p>

<h4>Positives</h4>

- Currently, what I am doing is trying to sell it on various Facebook pages which I think is quite inefficient. This resolves the issue.
- It is a good idea that I can try and get my flatmates a suitable person to live with in hope that the flat dynamic is not ruined.
- I like the map, as this means we can easily see how far the University is or whether it looks to be a good area.

<h4>Potential Issues/Improvements</h4>

<p>Would be quite useful to put in a section for situations like myself, where I want to advertise the group too and that I am selling as then I can directly sort out the details regarding the tenancy etc.</p>

- Could be slightly more aesthetically pleasing on the home page and login/register pages.
- Improved security credentials?

<h4>What have we done to address this?</h4>
- We think that the app can be used by a user in this situation.
- Tried to redesign the home/login/register pages to be more aesthetically pleasing.
- Clearly addressed that we will be using hashing to ensure that details remain secure.

<h3 align="center">User 3 – Young Professional (Potential user)</h3>

This user had used SpareRoom to find his current living situation, so was ideal in seeing how an app like this would make the experience better for him and his flatmates.

<h4>Positives</h4>

- This is a lot more fun than using SpareRoom to find a living situation.
- I think if I had used this app, I would have found a more suited household. In a pandemic, where we have spent lots of time indoors it would have been nice if we had more common ground.
- I like the material design. Very simple and easy to use.

<h4>Potential Issues/Improvements</h4>

- Would quite like an instant message service built-in, since then I don’t have to exchange contact details for every match I would get.
- A mobile app based on this would be a good idea in the future.
- Some more options in the profile might be a good idea for example relationship status and whether they would be visiting often etc.

<h4>What have we done to address this?</h4>

- We have decided to try and implement an instant message service using the Telegram API. Unsure on how complex that will be at the current stage of development.
- We would like both a mobile app and web page in a perfect world
- Tried to include more details within the profile, however visiting often can be difficult to add.

<h2 align="center">User Interaction Diagram</h2>

![image](https://user-images.githubusercontent.com/73884031/116906543-4f173880-ac38-11eb-8b00-9543484d84b5.png)

We have designed an interaction flow diagram using Figma, ensuring that we remain consistent with the wireframe we have also produced.
<br>

<h2 align="center">User Interaction Diagram</h2>

![image](https://user-images.githubusercontent.com/73884031/116906543-4f173880-ac38-11eb-8b00-9543484d84b5.png)

We have designed an interaction flow diagram using Figma, ensuring that we remain consistent with the wireframe we have also produced.

<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/tree/release">
<b>Homepage</b></a>
<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Group%20Working%20Methods.md">
<b>Next Section</b></a>

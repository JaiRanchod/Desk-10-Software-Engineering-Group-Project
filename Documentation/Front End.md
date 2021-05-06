<h1 align="center">Front End</h1>

<p>&nbsp;&nbsp;&nbsp;&nbsp;After some research and thought, the group decided that the use of a pre-made Angular template would be more suitable for a project of this scale since building an aesthetically pleasing user interface from scratch would be overly time-consuming, and time could be better allocated to other areas of the project. With this in mind, the team settled on a template from the Argon website - https://demos.creative-tim.com/argon-design-system-angular.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Due to a large number of files and styling sheets included, many hours were spent scanning through the initial template to fully understand how the components were interacting with each other, and the styling was being implemented. Once the template had been understood, the developers could then begin to remove unwanted classes and divisions, add new ones and implement new components to maintain the aesthetically pleasing style of the template whilst adding the functionality of the HouseHomies platform previously decided upon in the wireframe and paper prototypes.</p> 

<h1 align="center">Final Product</h1>

<h2 align="center"><b>Welcome Page</b></h2>


<p>&nbsp;&nbsp;&nbsp;&nbsp;The Welcome page component is the first page loaded on opening the website, acting as a navigation portal to redirect users depending on whether they are a new user or not. Here they can simply click the respective options to either sign in or register to create a new account.</p>

![image](https://user-images.githubusercontent.com/74371711/117005197-e040ea80-acde-11eb-97e9-8cc6fe015c3c.png)


<h2 align="center"><b>Login Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Login page is reached when a user clicks on the <b>SIGN IN</b> button. This component contains the central HouseHomies logo, and underneath is a central class, inside of which is text asking the user to "Sign in with credentials". Underneath this sits two input form classes for Email and Password, followed by the <b>SIGN IN</b> button.</p>

<p>The page also has "Forgot Password?" which is currently inactive as we weren't yet able to set up an automated email system. There is also a "Create new account" option as html tagged text, this simply directs the user back to our typeform registration</p>

![image](https://user-images.githubusercontent.com/74371711/117003868-4dec1700-acdd-11eb-9730-962b0aaacca1.png)


<h2 align="center"><b>Register Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Register page is reached when a user clicks on the <b>REGISTER</b> button. This component contains one simple type form embed, so does not use the same style background as the other pages. The central "START" button will begin the process of promoting a new user to complete 15 interactive fields from which their data will be stored in the database. Once they have finished registering, they are redirected to the login page to sing in and access their new account.</p>

![image](https://user-images.githubusercontent.com/74371711/117005034-b2f43c80-acde-11eb-9ee0-9ef17daf52fe.png)

<h2 align="center"><b>NavBar</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Outside of login and register, the navbar component remains at the top of the screen, we felt this was important for consistency when considering the user heuristics. This contains the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right. The settings tab creates a dropdown which provides two buttons, sign out which redirects back to login and sets current user as undefined. The second button is about us which simply redirects to the about us page.</p>

<h2 align="center"><b>Matches Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Matches pages acts as the main landing page after users login. This contains a for loop which loops through every other profile in the system, checking their liked array for our logged in user. If there is a match, a new match card is generated to appear on this page, filling up from left to right, else it will remain empty aside from the navbar. These match cards are a more condensed version of our main card component, with a <b>CONTACT</b> button to display the profiles phone number. While our inital intention was to have a messaging service built in to our app, this proved to be too difficult with our timeframe and so we felt providing contact details was the next best alternative. The match cards also contain a limited amount of information, a picture, age, gender and location.</p>

![image](https://user-images.githubusercontent.com/74371711/117003918-5c3a3300-acdd-11eb-9a87-20acdccdb96b.png)

<h2 align="center"><b>Homepage Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Homepage is where users are able to see other profiles to send likes and dislikes. The navbar is again loaded into this page to maintain consistency. The centre of the page contains a card containing cascading profile information of other users. The users are generated by getting an index for a user profile, checking that the profile isn't the user logged in or is not in the like or dislike array. This then fills up the profile within homepage.component.ts using the choose card function. The card component of the user profile selected is then displayed. </p>

<p>&nbsp;&nbsp;&nbsp;&nbsp; There is currently a known issue with filling the dislike array. This means that a user can dislike a profile and it appear again in their stack of profiles when they reload our page. However, we decided to spend time elsewhere instead of on this bug due to the small number of users. Not having users being added to the dislike array creates the issue of unseen profiles potentially being pushed further back in the stack which is less than ideal. However, due to the small number of users getting to the end of the stack was very quick so we decided to spend time elsewhere instead of this bug. We also viewed it as an opportunity to consider adding disliked profiles back into the stack after a set period of time, allowing users to change their mind if their circumstances change. This is something that we would consider for the future, after fixing this initial bug.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The card component includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, Personality, BIO. On the left centre of the card component is an interactive cross button and on the right side is an interactive tick button. If either of these buttons is clicked a yes or no is sent to the animation fuction, which triggers the corresponding animation. If the user profile has liked our signed in user, we recieve a match, a smaller match-popup component should appear saying "It's a match!" and the currently displayed user will then appear alongside other matched cards on the "Matches" page.</p>
  
![image](https://user-images.githubusercontent.com/74371711/117003888-547a8e80-acdd-11eb-8e06-c39d04cfcb09.png)

<h2 align="center"><b>Profile Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Profile page component is the page at which a user can view their personal profile, and the information contained within it. It is nearly identical to the layout of the Homepage card to maintain consistency for usability heuristics, similar to the constant nav bar. The centre of the page contains a card with cascading profile information of our signed in user, pulled from the database. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, Personality, BIO. The component should also to the right of the profile picture contain an <b>EDIT</b> button which takes a user to the Edit Profile page.</p>
  
￼![image](https://user-images.githubusercontent.com/74371711/117003940-62c8aa80-acdd-11eb-815d-ff14b3e8a78c.png)


<h2 align="center"><b>Edit Profile Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Edit Profile page component is the page at which a user can view and change their profile information. To continue with our consistency approach it is simply a card component that has prevously been used in the profile page. However, we instead have text input boxes under each of the users information where they have freedom to edit their desired field. This is then submitted and updated in the database by pressing the <b>SAVE</b> button. With more time we would have liked to use a slider for budget and dropdown boxes that were consistent with the typeform, however we chose the forms due to its ease of linking with the database since this was designed as an MVP.
  
![image](https://user-images.githubusercontent.com/74371711/117005124-c69fa300-acde-11eb-8ada-66093fc21a20.png)
  
<h2 align="center"><b>About Us Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;This is a simple page component containing only the navbar component at the top, followed by a central card container containing the HouseHomies logo, followed by paragraphs of text explaining more about the platform.</p>

![image](https://user-images.githubusercontent.com/74371711/117004989-a243c680-acde-11eb-80aa-f42d6939dd98.png)

<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/tree/release">
<b>Homepage</b></a>
<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Additional%20Elements%20and%20Components.md">
<b>Next Section</b></a>

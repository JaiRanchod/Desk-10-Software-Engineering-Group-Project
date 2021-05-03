<h1 align="center">Front End</h1>

<p>&nbsp;&nbsp;&nbsp;&nbsp;After some research and thought, the group decided that the use of a pre made angular template would be more suitable for a project of this scale since building an astetically pleasing user interface from scratch would be overly time consuming, and time could be better allocated to other areas of the project. With this in mind, the team settled on a template from the Argon website - https://demos.creative-tim.com/argon-design-system-angular.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Due to the large number of files and styling sheets included, may hours were spent scanning through the initial template to fully understand how the components were interacting with each other and the styling was being implemented. Once the template had been understood, the decvelopers could then begin to remove unanted classes and divisions, add new ones and implement new components to maintin the astetically pleasing style of the tomplete whilst adding the functionality of the HouseHomies platform previously decided upon in the wireframe and paper prototypes.</p> 

<h1 align="center">Final Product</h1>

<h2 align="center"><b>Welcome Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Welcome page componet is the first page loaded when the localhost link is visited. It is a simple page containing just the Househomies logo, the HouseHomies slogan and a <b>SIGN IN</b> and <b>REGISTER</b> button. 
  
Screenshot to be added later.
  
<h2 align="center"><b>Login Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Login page is reached when a user clicks on the <b>SIGN IN</b> button. This component contains the central HouseHomies logo, and underneath is a central class inside of which is test asking the user to "Sign in with credentials". Underneath this is two input form classes for Email and Password followe by the <b>SIGN IN</b> button. If inputted credentials match those stored in the database, a second redirect to homepage button will appear.</p>

<p>The page also has "Forgot Password?" and "Create new account" options.</p>

Screenshot to be added later.

<h2 align="center"><b>Register Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Register page is reached when a user clicks on the <b>REGISTER</b> button. This component contains one simple type form embed, so does not use the same style of background as the other pages. The central "START" button will begin the process of prompting a new user to comlete 15 fields from which their data will be stored in the database.</p>

Screenshot to be added later.

<h2 align="center"><b>Homepage Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Homepage is the main matching page, it contains the navbar component at the top which contains the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right. The centre of the page contains a card containing cascading profile information of other users, pulled and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO. On the left centre of the card component is an interactive cross button. On the right centre of the card component should be an intercative tick button. If either of these buttons are clicked a swiping animation is implemented, whereby the card swipes off to either the left or right of the page and dissapears. If by chance profile preferences match with the signed in user then a smaller card component should appear saying "It's a match!" and the displayed user will then appear alongisde other matched cards on the "Matches" page.
  
 Screenshot to be added later.

<h2 align="center"><b>Matches Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Matches page component is the page which dispays to a user small card compoenents of other users which they have matched with. it also contains the navbar component at the top which contains the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right. If no matches have yet happened then the page will simply contain test floating to the left and nothing else. However as the user gets more matches, small cards will appear containing the display picture, age, genera and location of the user they have matched with. These card will fill the page from left to right and downwards as more matched occur.</p>

Screenshot to be added later.

<h2 align="center"><b>Profile Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Profile page component is the page at which a user can view their personal profile, and the information contained within in. It is nearly identical to the layout of the Homepage card, and this was done purposely to save time and also keep the style of the interface consistent. The page also contains the navbar component at the top which contains the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right. The centre of the page contains a card containing cascading profile information of other users, pulled and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO. The component should also to the right of the profile picture contain an <b>EDIT</b> button which takes a user to the Edit Profile page.
  
Screenshot to be added later.

<h2 align="center"><b>Edit Profile Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The Edit Profile page conmponent is the page at which a user can view and change their their profile information. The page also contains the navbar component at the top which contains the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right. The page contains all central profile information found on the initial Profile page but under each of these a form is included allowing the user to submit their edited profile information. Once the user if finished editing their information, a <b>SAVE</b> button is present in place of the <b>EDIT</b> button from the Profile page.
  
Screenshot to be added later.
  
<h2 align="center"><b>About Us Page</b></h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;This is a simple page compoennt containing only the navbar compoent at the top, followed by a central card container containing the HouseHomies logo, followed by paragraphs of text explaining more about the platform.</p>

Screenshot to be added later.


talk about the template
walk through all pages
methods we used


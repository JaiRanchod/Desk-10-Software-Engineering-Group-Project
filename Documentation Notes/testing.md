#
<h1>Testing</h1>
<h1>Reasons For Testing</h1>

- Brings the code up to a professional high-quality standard. This is especially important when developing mission critical systems such as payment systems.
- Testing allows developers to refactor our code over and over again.
- Testing allows developers to remove unintended scenarios and consequences from their work.
- Must orient tests around the behaviour of our app.
- There are two types of testing - Doccumented Functinal testing and Coded Automated Testing

<h2>Functional Testing</h2>

<h4><b>Welcome Page</b></h4>

- Initial router link page should load the welcome page upon calling localhost3000 link.
- The page should initially contain two central buttons only, <b>SIGN IN</b> and <b>REGISTER</b>, along with the HouseHomies logo.
- <b>SIGN IN</b> button should router link to the <b>Login</b> Page.
- <b>REGISTER</b> button should router link to the Register page containing the type form embed.

<h4><b>Login Page</b></h4>

- <b>SIGN IN</b> button should router link to the Login Page.
-	The page should contain two forms, <b>Email</b> and <b>Password</b>.
-	If user inputs information in either of the two forms that does not correctly match with data stored in the database, and “Invalid Username” or “Invalid Password” error message should appear.
-	If the information entered within the <b>Email</b> and <b>Password</b> forms matches data stored in the database, a “Successful Login prompt” should appear and the user will be granted access to a router link button to their individual profile page.
-	The page should contain the central HouseHomies logo.
-	This logo should be router linked back to the Welcome page.
-	The page should also contain two router linked text fields, “Forgot password?” and “Create new account” below the logo and form boxes.
-	The “Forgot password?” link is tbc.
-	The “Create new account” link should router link the user to the Register page containing the type form embed.

<h4><b>Register Page</b></h4>

- The <b>START</b> button should display 15 questions as input forms, always in the same order.
- The register page should contain one <b>START</b> button. Once clicked should display 15 questions as input forms, always in the same order.
- The data inputted into these forms should be sent to and stored in the database.
- Once the end of the type form questions has been reached, the page will display a router linked <b>Submit</b> button.
- The <b>Submit</b> button should router link take the user to the Login page where they can then login.

<h4><b>Homepage Page</b></h4>

- The Homepage should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
- The “Home” link should router link the user to the Homepage page.
- The “Profile” link should router link the user to the User-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information of other users, pulled and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO.
-	On the left centre of the card component should be an interactive cross button. If clicked the current displayed user should be removed from view and should not be matched with the signed in user. The users card should then not be displayed a second time.
-	 On the right centre of the card component should be an intercative tick button. If clicked the current displayed user should also be removed from view. However, if their profile preferences match with the signed in user then a smaller card component should appear saying "It's a match!" and the displayed user should then appear alongisde other matched cards on the "Matches" page.

<h4><b>Matches Page</b></h4>

-	The Matches page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the User-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	The page should appear empty of match card components if the user has not yet matched with anyone.
-	If the user has matched with other users’ cards should appear on the screen, these will have a profile photo and basic information about the users they have matched with.

<h4><b>Profile Page</b></h4>

-	The Profile page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the User-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information the user provided in the register type form, pulled, and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO.
-	The component should also to the right of the profile picture contain an <b>EDIT</b> button.
-	Once clicked, this <b>EDIT</b> button should router link to the “Edit Profile” page.


<h4><b>Edit Profile Page</b></h4>

-	The Edit Profile page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the user-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information the user provided in the register type form, pulled, and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO. Underneath each of these in formation fields should be an html form box, where the user can edit each information field.
-	The component should also to the right of the profile picture contain a <b>SAVE</b> button.
-	Once clicked, this <b>SAVE</b> button should update the current information in the database with the new information inputted in the html form boxes.

<h4><b>About Us Page</b></h4>

-	The About Us page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the user-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing the about us paragraphs of text. 
-	No buttons should be present in this section.


<h2>Coded Automated Testing</h2>





	






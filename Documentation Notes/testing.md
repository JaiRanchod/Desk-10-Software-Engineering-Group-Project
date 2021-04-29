#
<h1>Testing</h1>
<h1>Reasons For Testing</h1>

-	Contribute to society and to human well-being, acknowledging that all people are stakeholders in computing. 
-	Avoid harm.
-	Be honest trustworthy.
-	Be fair and act not to discriminate.
-	Respect the work required to produce new ideas, inventions, creative works, and computing artifacts.
-	Respect privacy.
<h2>Functional Testing</h2>
<h4><b>Welcome Page Front End</b></h4>

- Initial router link page should load the welcome page upon calling localhost3000 link.
- The page should initially contain two central buttons only, <b>SIGN IN</b> and <b>REGISTER</b>, along with the HouseHomies logo.
- <b>SIGN IN</b> button should router link to the <b>Login</b> Page.
- <b>REGISTER</b> button should router link to the Register page containing the type form embed.

<h4><b>Login Page</b></h4>

- <b>SIGN IN</b> button should router link to the Login Page.
-	The page should contain two forms, Email and Password.
-	If user inputs information in either of the two forms that does not correctly match with data stored in the database, and “Invalid Username” or “Invalid Password” error message should appear.
-	If the information entered within the email and password forms matches data stored in the database, a “Successful Login prompt” should appear and the user will be granted access to a router link button to their individual profile page.
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
- The Submit button should router link take the user to the Login page where they can then login.

<h4><b>Homepage Page</b></h4>

- The Homepage should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
- The “Home” link should router link the user to the Homepage page.
- The “Profile” link should router link the user to the user-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information of other users, pulled and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, Personality, Matches, BIO.
	






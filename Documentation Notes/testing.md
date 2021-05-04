#
<h1 align="center">Testing</h1>
<h2 align="center">Reasons For Testing</h1>

- Brings the code up to a professional high-quality standard. This is especially important when developing mission critical systems such as payment systems.
- Testing allows developers to refactor our code over and over again.
- Testing allows developers to remove unintended scenarios and consequences from their work.
- Must orient tests around the behaviour of our app.
- There are two types of testing - Doccumented Functinal testing and Coded Automated Testing

<h2 align="center">Functional Testing</h2>

<h3 align="center"><b>Welcome Page</b></h3>

- Initial router link page should load the welcome page upon calling localhost3000 link.
- The page should initially contain two central buttons only, <b>SIGN IN</b> and <b>REGISTER</b>, along with the HouseHomies logo.
- <b>SIGN IN</b> button should router link to the <b>Login</b> Page.
- <b>REGISTER</b> button should router link to the Register page containing the type form embed.

<h3 align="center"><b>Login Page</b></h3>

- <b>SIGN IN</b> button should router link to the Login Page.
-	The page should contain two forms, <b>Email</b> and <b>Password</b>.
-	If user inputs information in either of the two forms that does not correctly match with data stored in the database, and “Invalid Username” or “Invalid Password” error message should appear.
-	If the information entered within the <b>Email</b> and <b>Password</b> forms matches data stored in the database, a “Successful Login prompt” should appear and the user will be granted access to a router link button to their individual profile page.
-	The page should contain the central HouseHomies logo.
-	This logo should be router linked back to the Welcome page.
-	The page should also contain two router linked text fields, “Forgot password?” and “Create new account” below the logo and form boxes.
-	The “Forgot password?” link is tbc.
-	The “Create new account” link should router link the user to the Register page containing the type form embed.

<h3 align="center"><b>Register Page</b></h3>

- The <b>START</b> button should display 15 questions as input forms, always in the same order.
- The register page should contain one <b>START</b> button. Once clicked should display 15 questions as input forms, always in the same order.
- The data inputted into these forms should be sent to and stored in the database.
- Once the end of the type form questions has been reached, the page will display a router linked <b>Submit</b> button.
- The <b>Submit</b> button should router link take the user to the Login page where they can then login.

<h3 align="center"><b>Homepage Page</b></h3>

- The Homepage should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
- The “Home” link should router link the user to the Homepage page.
- The “Profile” link should router link the user to the User-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information of other users, pulled and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO.
-	On the left centre of the card component should be an interactive cross button. If clicked the current displayed user should be removed from view and should not be matched with the signed in user. The users card should then not be displayed a second time.
-	 On the right centre of the card component should be an intercative tick button. If clicked the current displayed user should also be removed from view. However, if their profile preferences match with the signed in user then a smaller card component should appear saying "It's a match!" and the displayed user should then appear alongisde other matched cards on the "Matches" page.

<h3 align="center"><b>Matches Page</b></h3>

-	The Matches page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the User-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	The page should appear empty of match card components if the user has not yet matched with anyone.
-	If the user has matched with other users’ cards should appear on the screen, these will have a profile photo and basic information about the users they have matched with.

<h3 align="center"><b>Profile Page</b></h3>

-	The Profile page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the User-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information the user provided in the register type form, pulled, and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO.
-	The component should also to the right of the profile picture contain an <b>EDIT</b> button.
-	Once clicked, this <b>EDIT</b> button should router link to the “Edit Profile” page.


<h3 align="center"><b>Edit Profile Page</b></h3>

-	The Edit Profile page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the user-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing cascading profile information the user provided in the register type form, pulled, and displayed from the API. This includes profile picture, Preferred Name, Location, Gender, Age, Religion, Contact Number, University Course, Budget, BIO. Underneath each of these in formation fields should be an html form box, where the user can edit each information field.
-	The component should also to the right of the profile picture contain a <b>SAVE</b> button.
-	Once clicked, this <b>SAVE</b> button should update the current information in the database with the new information inputted in the html form boxes.

<h3 align="center"><b>About Us Page</b></h3>

-	The About Us page should have the navbar component at the top containing the HouseHomies logo, and router linked headers, “Home”, “Matches”, “Profile, “Settings” and social media icon links respectively from left to right.
-	The “Home” link should router link the user to the Homepage page.
-	The “Profile” link should router link the user to the user-profile page.
-	The “Matches” link should router link the user to the Matches page.
-	The “Settings” heading should contain a hover over dropdown menu with two router linked headings, “About Us” and “Logout”.
-	In the centre of the page should be an html section containing the about us paragraphs of text. 
-	No buttons should be present in this section.


<h2 align="center">Coded Automated Testing</h2>

When we first ran ng test, we had various tests failing due to the objects being undefined and therefore the HTML not recognising any input, as shown below.

![image](https://user-images.githubusercontent.com/73884031/117061108-b6f18000-ad19-11eb-84b3-0e74f52da7a5.png)

After resolving these (through the help of Marceli) we were then able to begin writing some of our own tests. 

Beginning in the profile component of our app, we check if after setting the components for the page, whether they are displayed to the user. This test is shown here:

```typescript
it('should display the data', () => {
    expect(component).toBeTruthy();
    component.firstName = "Hi";
    component.lastName = "Checking";
    fixture.detectChanges();
    const app = fixture.debugElement.componentInstance;
    expect(app.firstName).toEqual("Hi");
    expect(app.lastName).toEqual("Checking");    
  })
  
  ```
  
  This test shows us that when we read in a profile for a user, it will be displayed correctly when needed. 
  
  Moving on to the edit profile component, we again check if the information is displayed correctly, however we are testing here that this will also be the value in a textbox (the same variable is used for both). The test for this is very similar to the one above so I will just move on to the next. In this component, we are checking that when the user presses the save button they are taken back to the profile page to look at their newly edited profile, and the test is shown here:
  
  ```typescript
it('should navigate back to the profile page', () => {
    const component = fixture.componentInstance;
    let router = TestBed.get(Router);
    const trackSpy = spyOn(router, 'navigate');
    component.handleClick();
    fixture.detectChanges();
    expect(trackSpy).toHaveBeenCalledWith(['/user-profile']);
  })
  
  ```
  
  As previously mentioned, we moved from using this method to using an interface to make our lives easier and have more efficient code. For the homepage component, I went and created a profile and set this within the component. I then tried to pull a field from the profile and check it against the correct string to ensure that when we using this interface, it was working correctly. The test is shown here:
  
   ```typescript
it('should display a card', () => {
    expect(component).toBeTruthy();
    component.user_profile = {
      _id: 'profile id',
      "Age": 10,
      Image: "https://images.unsplash.com/photo-1617375407361-9815100c4324?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60",
      "Bio": 'profile bio',
      "First Name": 'profile first',
      "Gender": 'profile gender',
      "Location": 'profile location',
      "Phone Number": 'profile phone no',
      "Preferred Name": 'profile preferred',
      "Religion": 'profile religion',
      "Surname": 'profile surname',
      "University Course": 'profile university',
      "like": [],
      "dislike": [],
      "Budget": 'profile budget',
      "Personality": 'profile personality',
    };
    component.cur_card = {
      _id: 'profile id',
      "Age": 10,
      Image: "https://images.unsplash.com/photo-1617375407361-9815100c4324?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60",
      "Bio": 'profile bio',
      "First Name": 'checking first',
      "Gender": 'profile gender',
      "Location": 'profile location',
      "Phone Number": 'profile phone no',
      "Preferred Name": 'profile preferred',
      "Religion": 'profile religion',
      "Surname": 'profile surname',
      "University Course": 'profile university',
      "like": [],
      "dislike": [],
      "Budget": 'profile budget',
      "Personality": 'profile personality',
    };
    fixture.detectChanges();
    const app = fixture.debugElement.componentInstance;
    expect(component.cur_card['First Name']).toEqual("checking first");
  })
  
  ```
  We also wrote some other tests but due to time constraints we were unable to implement them successfully. In the future, we would definitely choose to call a method in the typescript file that would navigate to the correct page rather than doing it directly within the HTML. 
  
  ```typescript
it('should navigate to login', () => {
    const component = fixture.componentInstance;
    let router = TestBed.get(Router);
    const trackSpy = spyOn(router, 'navigate');
    fixture.detectChanges();
    expect(trackSpy).toHaveBeenCalledWith(['/login']);
  })

  it('should navigate to register', () => {
    const component = fixture.componentInstance;
    let router = TestBed.get(Router);
    const trackSpy = spyOn(router, 'navigate');
    fixture.detectChanges();
    expect(trackSpy).toHaveBeenCalledWith(['/register']);
  })
  
  ```






	






**Data Model** 

Original Data Model

Our data model (below) was made using diagrams.net. This allowed us to work collaboratively on the data model ensuring all perspectives were heard and accounted for. We have tried to cover every base of an initial project, and we think there is scope for the project to be expanded with more data collected. 

![img](https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Data%20Model.png)

We have stored everything using the UserID, since this is always unique and means we should be able to select information from different tables as required. 

We have stored personal details separately so we can pull all these details up when we are displaying the profile of users to other users. 

We have stored the personality scores derived from our personality quiz separately again to ensure that we can pull just the score to calculate if users are a match with other users. 

Storing the likes and dislikes of users separately again has meant we can just do a check to see if they have previously matched with this user. Additionally, storing the userIDs of disliked users means we can attempt to prevent showing them again to users as we feel this would lower the user satisfaction derived from the app. 

Revised Data Model

![Screenshot 2021-05-03 164638](https://user-images.githubusercontent.com/73884031/116899569-a06efa00-ac2f-11eb-91fc-7d19a4e31609.png)

Originally we had various different tables in our data model, however soon realising the huge amount of work we needed to complete meant we had to narrow our scope. Instead of having a personality quiz, we decided to use some personality questions that would then evaluate the likely personality of an individual and store this within the User Personal Details table. 

We also realised that when creating the documents after registering a user, the ID that was automatically generated was not the same for both the documents. We had to quickly think on our feet and use the email as the foreign key. We use the email address to get the relevent details for a user when required. Addtionally, we use the email address to get the ID of the users personal details meaning we can use this when needed too. This is a relatively simple data model, however the main complexity we found was using the arrays to match up users. I think we potentially could have again used the Email address as a foreign key in an addtional table that holds the likes and dislikes array to make processing slightly less intensive and is something we would have liked to trial if there was more time. 

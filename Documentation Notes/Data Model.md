**Data Model** 

Our data model (below) was made using diagrams.net. This allowed us to work collaboratively on the data model ensuring all perspectives were heard and accounted for. We have tried to cover every base of an initial project, and we think there is scope for the project to be expanded with more data collected. 

![img](https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/main/Documentation%20Notes/Data%20Model.png)

We have stored everything using the UserID, since this is always unique and means we should be able to select information from different tables as required. 

We have stored personal details separately so we can pull all these details up when we are displaying the profile of users to other users. 

We have stored the personality scores derived from our personality quiz separately again to ensure that we can pull just the score to calculate if users are a match with other users. 

Storing the likes and dislikes of users separately again has meant we can just do a check to see if they have previously matched with this user. Additionally, storing the userIDs of disliked users means we can attempt to prevent showing them again to users as we feel this would lower the user satisfaction derived from the app. 

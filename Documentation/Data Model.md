<h1 align="center"> <b>Data Model</b> </h1>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Our data model (below) was made using diagrams.net. This allowed us to work collaboratively on the data model ensuring all perspectives were heard and accounted for. We have tried to cover every base of an initial project, and we think there is scope for the project to be expanded with more data collected.</p> 

![image](https://user-images.githubusercontent.com/73884031/117432040-cfcc8200-af21-11eb-9439-c850a54fac5c.png)

<p>&nbsp;&nbsp;&nbsp;&nbsp;We have stored everything using the UserID, since this is always unique and means we should be able to select information from different tables as required.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;We have stored personal details separately so we can pull all these details up when we are displaying the profile of users to other users.</p> 

<p>&nbsp;&nbsp;&nbsp;&nbsp;We have stored the personality scores derived from our personality quiz separately again to ensure that we can pull just the score to calculate if users are a match with other users.</p> 

<p>&nbsp;&nbsp;&nbsp;&nbsp;Storing the likes and dislikes of users separately again has meant we can just do a check to see if they have previously matched with this user. Additionally, storing the userIDs of disliked users means we can attempt to prevent showing them again to users as we feel this would lower the user satisfaction derived from the app.</p> 

<h1 align="center"> <b>Revised Data Model</b> </h1>

![image](https://user-images.githubusercontent.com/73884031/117432495-597c4f80-af22-11eb-99e0-fb16853c486a.png)

<p>&nbsp;&nbsp;&nbsp;&nbsp;This data model was made using https://dbdiagram.io/d. We found this to be more aesthetically pleasing and it allowed us to create clear links between the 2 databases.</p> 

<p>&nbsp;&nbsp;&nbsp;&nbsp;In the revised data model, we have cleaned up a few fields, since we narrowed the scope to try and create a successful website. We decided to cut it down to one image and cut out the personality quiz. We still had a variation of personality data stored within our database however this was determined by the typeform rather than a quiz. Additionally, we changed having the likes and dislikes array separately to the profile, however for ease and time purposes we decided to keep them together. Additionally, we were hoping to use the id field as a foreign key, however this was difficult in the typeform since all different documents are created with a different id, even though they were created at the same time.</p> 

<p>&nbsp;&nbsp;&nbsp;&nbsp;We changed this key to email and it worked successfully, however we understand there could be security concerns, so we began to use the id field towards the end and in the future would like to commit to this more.</p> 

<p>&nbsp;&nbsp;&nbsp;&nbsp;In the future, we think we could again alter the data model to be more efficient, for example using the id to have a database with the likes and dislikes array (similar to the original data model) however for the time pressure this worked well and we were happy with it.</p> 

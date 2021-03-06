<h1 align="center">Deployment Details</h1> 

<h2 align="center">Docker, Continuous Integration and Deployment</h2>

<p>&nbsp;&nbsp;&nbsp;&nbsp;As instructed by lecturers, we were told to implement a docker-compose script. Initially, we had many difficulties getting this working and we were all using different platforms which meant it was slightly tricky. Eventually, we got it running and it was easy to see the benefits of using the docker script.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;We understood that now we had this script in place, we were able to ensure the whole MEAN stack was working together and we were able to ensure data was retrieved and posted when necessary. Through using Docker (a form of containerization) we were able to know that if our program was working well on this container it would work on all similar Linux machines and be deployable on a greater scale.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;Another thing we would have liked to do was implement automatic testing shown in the lectures with the Git repo. We feel this was a missed opportunity and did lead to some errors occurring however, in order to overcome this we had to mainly just test the code ourselves</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;The only downside we encountered was this taking up a huge amount of time. Every time we wanted to deploy a version; we would need to do:</p>

1) ng build
2) docker-compose up –build -d. 

<p>This took a lot of time if we were changing just one line of code and towards the end this was the case due to us trying to fix any bugs.</p>

<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/tree/release">
<b>Homepage</b></a>
<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/release/Documentation/Design%20Process.md">
<b>Next Section</b></a>

Deployment Details 

Docker, Continuous Integration and Deployment 

As instructed by lecturers, we were told to implement a docker-compose script. Initially, we had many difficulties getting this working and we were all using different platforms which meant it was slightly tricky. Eventually, we got it running and it was easy to see the benefits of using the docker script. 

We understood that now we had this script in place, we were able to ensure the whole MEAN stack was working together and we were able to ensure data was retrieved and posted when necessary. Through using Docker (a form of containerization) we were able to know that if our program were working well on this container it would work on all similar Linux machines and be deployable on a greater scale. 

The only downside we encountered was this taking up a huge amount of time. Every time we wanted to deploy a version; we would need to do 1) ng build 2) docker-compose up –build -d. This took a lot of time if we were changing just one line of code and towards the end this was the case due to us trying to fix any bugs we had. 

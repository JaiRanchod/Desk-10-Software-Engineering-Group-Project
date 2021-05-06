<h1 align="center"> <b> Team Use of GitHub </b> </h1>

<p>&nbsp;&nbsp;&nbsp;&nbsp;When we created our repository the default branch was main, however we soon realised that it made sense to make the default branch develop for the time being and agreed to make our final merge to the release branch where this would become our default branch in preparation for marking. Through the term, we increased our knowledge of Git through both Overview of Software Tools and our own research.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;At the start of the project, we had quite severe problems resulting in our commit history having some commits related to trying to fix all of this. Due to platform dependencies and the .gitignore file not having /node_modules included, anytime we tried to pull the copy in to our local working version, we had issues trying to ng serve it, even though it worked for others. To resolve this we changed the .gitignore file and cleaned up the whole branch to make our lives easier in the future. Along with this we saw that team members were working on so many files that we were having various merge conflicts and this meant we were wasting a lot of time trying to resolve these.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;After reading the article (the link for this is in the references) and learning more in Software Tools, we saw that we needed to change our style of working and Git use. Even though we all had our own branch to work on, we were still experiencing issues. Based on this article, we saw that we should always start the day on our develop branch as this would have the latest version on to try and avoid any problems in the future. Before touching any files, we would have a meeting to discuss what features and files people would likely being working on, in an attempt to minimise the number of conflicts we would have. We would then use the commands 1) git fetch (to ensure that we are looking at the latest version) 2) git pull (to copy the files from the repository in to our computer) and 3) 'git checkout -b "new-branch"', to copy this latest version in to somewhere safe we could make changes and feel like if anything did go wrong, we could restore to a version that worked and then try again. We would then proceed to carry out our work for the day and have a call later in the day to see what everyone managed to complete and check if any merges needed to take place. Once these merges took place, we were able to delete our branch at the end of the day and then repeat the whole process again the following day.</p>

<p>&nbsp;&nbsp;&nbsp;&nbsp;One thing to note is that when working in University became an option, it became a lot easier to resolve any unavoidable merge conflicts since we could easily explain what the line we edited was needed for and how to best merge the files.</p> 

# References
https://medium.com/@lucaasrojas/a-day-with-git-eab80f143e1c

<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project">
<b>Homepage</b></a>
<br>
<a href="https://github.com/JaiRanchod/Desk-10-Software-Engineering-Group-Project/blob/develop/Documentation%20Notes/Design%20Evaluation.md">
<b>Next Section</b></a>

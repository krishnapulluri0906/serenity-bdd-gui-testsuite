# serenity-bdd-gui-testsuite
Below are the command to setup Docker on Windows machine.

# Downloading Docker for Windows

1. Install docker from below link - https://github.com/docker/toolbox/releases (DockerToolbox-19.03.1.exe)

2. If you have installed it successfully, then you will get the following three Docker toolbox icons. 
  Virtual Box, Docker Quickstart, Kitematic (Alpha).

3. After installing Docker toolbox double-click and open the Docker quickstart terminal

# Install Docker Images to create docker hub and run test on docker

1. docker pull selenium/hub
2. docker pull selenium/node-chrome
3. docker pull selenium/node-firefox
4. docker run -d -p 4444:4444 -–name selenium-hub selenium/hub
5. docker run -d --link selenium-hub:hub selenium/node-chrome
6. docker run -d --link selenium-hub:hub selenium/node-firefox
7. docker ps -a ( command is used to check all processes running on docker)

# Run Test suite on Docker and check docker hub is running or not

1. On browser hit the url - http://ipaddress:4444/grid/console e.g http://192.168.99.100:4444/grid/console

2. To run the test suite on docker execute below command on command prompt.
mvn verify -Dcucumber.options="--tags '@login'" -DexecutionPlatform="GRID_CHROME"

-----------------------------------------------------------------------------------------------

# Setup zelenium Grid on docker

# Execute below commands on docker to setup zelenium grid
1. docker pull dosel/zalenium
2. docker pull elgalu/selenium
3. docker run --rm -ti --name zalenium -p 4444:4444 -v /var/run/docker.sock:/var/run/docker.sock -v /d/zalenium/videos:/home/seluser/videos --privileged dosel/zalenium start

Note - If any process is running on machine then you can kill the process and stop the container using below commands
1. docker stop <selenium/hub container id>
2. docker rm <container_id> - remove containers from the list of processes

# Test zelenium grid running or not

1. On browser hit the url  http://ipaddress:4444/grid/console e.g http://192.168.99.100:4444/grid/console - This url will show you grid is up and running
2. http://ipaddress:4444/grid/admin/live - e.g http://192.168.99.100:4444/grid/admin/live  - User is able to see live video of running test cases.
3. http://ipaddress/dashboard -  e.g. http://192.168.99.100:4444/dashboard - You can see video of executed test cases. 

# Execute below maven command to run the selenium test suite.

mvn verify -Dcucumber.options="--tags '@login'" -DexecutionPlatform="GRID_CHROME"













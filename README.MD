# Selenium-Grid 

Selenium-Grid can be used to run multiple selenium tests in parallel and on different devices.
This project contains a docker-compose file and one basic test which runs on all the selenium nodes.

### Docker-compose

The docker compose file starts the selenium grid. First it starts the hub (which handles the nodes), 
then it starts the desktop browser nodes (firefox and chrome) and at last it starts the appium server
which handles the connection to the emulated android device.

### Test structure

One AbstractTestCase which has the actual test implementation and for each platform (firefox,
chrome and android) there is a test which inherits from this abstract test and has the necessary 
driver capabilities implemented.

### Requirements

For the android emulation to work the android sdk has to be installed. The compose file then maps the 
android folder to the android docker container.

### Setup

###### Docker
```ssh
$ cd /path_to_project/
$ docker-compose up -d
```

###### Tests
```ssh
$ ./gradlew cleanTest test
```
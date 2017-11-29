#! /bin/bash
#Install Java
sudo apt-get update
sudo apt-get install default-jre -y
sudo apt-get install default-jdk -y
#Install Curl and Git
sudo apt-get install curl
sudo apt-get install git
#Install Jenkins
wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list' -y
sudo apt-get update
sudo apt-get install jenkins -y
netstat -tulpn | grep 8080
sudo /etc/init.d/jenkins start

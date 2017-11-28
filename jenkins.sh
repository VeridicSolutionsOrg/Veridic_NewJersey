#! /bin/bash
#Install Java
sudo apt-get update
sudo apt-get install default-jre
sudo apt-get install default-jdk
#Install Curl and Git
sudo apt-get install curl
sudo apt-get install git
#Install Jenkins
wget -q -O - http://pkg.jenkins-ci.org/debian/jenkins-ci.org.key | sudo apt-key add -
sudo sh -c 'echo deb http://pkg.jenkins-ci.org/debian binary/ > /etc/apt/sources.list.d/jenkins.list'
sudo apt-get update
sudo apt-get install jenkins -y
netstat -tulpn | grep 8080
systemctl jenkins start
systemctl jenkins enable

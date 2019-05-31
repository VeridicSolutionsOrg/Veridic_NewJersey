#!groovy

pipeline {
  agent {label "${whichagent}"}
  stages{ 
    stage('Checkout SCM') {
      agent{label "${whichagent}"}
      steps{
          checkout([
           $class: 'GitSCM', 
           branches: [[name: "${whichbranch}"]], 
           doGenerateSubmoduleConfigurations: false, 
           extensions: [], 
           submoduleCfg: [], 
           userRemoteConfigs: [
           [credentialsId: 'Bitbucket-Jenkins-Key', 
            url: '']
           ]])
      }
    }
    stage('Docker Build') {
      agent {label "${whichagent}"}
      steps {
        sh 'docker image prune -f'
        sh 'docker build -t "${projectname}" .'
      }
    }
    stage('Docker Push') {
      agent {label "${whichagent}"}
        steps {
         script{
        withDockerRegistry([credentialsId: 'docker-registry-credentials', url: "https://dtr..com"]) {
          sh 'docker tag "${projectname}":latest "${imagename}"'
          sh 'docker push "${imagename}"'
        }
         }
        }
        }
        stage ('Starting to deploy image onto Kubernetes cluster Using Kubectl Server') {
      steps{
           sh '''#!/bin/bash
echo -e "$imagename Tag name of the Image that deployed"
echo -e "$Deployin Environment that Image needs to be deployed"

if [ "$Deployin" == "Dev" ] 
then
ssh -i /home/pem/key -o StrictHostKeyChecking=no ec2-user@"$IP" "bash -s" << EOF
    cd /home/ec2-user/kubernetes/<filepath>
    kubectl set image --filename="$deploymentfile" "$Containername"=$imagename 
EOF

elif [ "$Deployin" == "Stage" ]
then
ssh -i /home/pem/key -o StrictHostKeyChecking=no ec2-user@"$IP" "bash -s" << EOF
    cd /home/ec2-user/kubernetes/<filepath>
    kubectl set image --filename="$deploymentfile" "$Containername"=$imagename 
EOF

elif [ "$Deployin" == "Demo" ]
then
ssh -i /home/pem/key -o StrictHostKeyChecking=no ec2-user@"$IP" "bash -s" << EOF
    cd /home/ec2-user/kubernetes/<filepath>
    kubectl set image --filename="$deploymentfile" "$Containername"=$imagename 
EOF
else
echo -e "Please provide correct Environment name that exists in (Dev,Stage,Demo,Prod)"
exit 1

fi'''
      }
}
  }
}
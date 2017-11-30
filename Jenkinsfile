pipeline {
    agent any
    stages{
    stage('checkout to branch')
    steps{
    sh 'git checkout Verdic/Sri3009'
    }
    }
    stages {
        stage('Build') {
            steps {
                sh 'echo "Task accomplished"'
                }
              }
             }
      stages {
         stage('Deploy'){
            steps{
              sh 'echo "deploy"'
              }
             }
            }
       }

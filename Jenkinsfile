pipeline {
    agent any
    stages{
        stage('checkout'){
    steps{
    sh 'git checkout veridic/rcparimala'
    }
    }
        stage('Build') {
            steps {
                sh 'echo "Task accomplished"'
                }
              }
         stage('Deploy'){
            steps{
              sh 'echo "deploy"'
             }
            }
       }
}

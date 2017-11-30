pipeline {
    agent any 

    stages {
        stage('Checkout') { 
            steps { 
                sh 'git --version' 
            }
        }
        stage('Build'){
            steps {
                sh 'git branch'
                
            }
        }
        stage('Deploy') {
            steps {
                sh 'whoami'
            }
        }
    }
}

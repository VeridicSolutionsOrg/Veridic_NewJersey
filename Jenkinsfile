pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                sh 'git checkout veridic/buddipn'
            }
        }
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Deployed Successfully"'
            }
        }
    }
}

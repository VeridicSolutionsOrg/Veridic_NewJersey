
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                sh 'git checkout veridic/ManojPeddireddy'
            }
        }
        stage('Build') {
            steps {
                sh 'git branch'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo "Hello World"'
            }
        }
    }
}

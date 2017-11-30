#Jenkinsfile (Declarative Pipeline)
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git checkout veridic/ManojPeddireddy
            }
        }
        stage('Build') {
            steps {
                git branch
            }
        }
        stage('Deploy') {
            steps {
                echo 'Hello World'
            }
        }
    }
}

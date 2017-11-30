pipeline {
    agent any 

    stages {
        stage('Checkout') { 
            steps { 
               echo "Checked out" 
            }
        }
        stage('Build'){
            steps {
                echo "Trigger build"
            }
        }
        stage('Deploy') {
            steps {
                echo "Pipeline deployed"
            }
        }
    }
}

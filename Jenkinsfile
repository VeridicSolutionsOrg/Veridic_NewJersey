pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                sh 'git checkout veridic/rajeshevuri'
            }
            }
    stage('BUILD'){
    steps{
    sh 'echo "task finished"'
    }
    }
    stage ('Deploy'){
    steps{
    sh 'echo "deployed"'
    }
    }
    }
}

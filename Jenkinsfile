pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                sh 'git checkout veridic/rajeshevuri'
            }
            }
    stage('create file'){
    steps{
    sh 'touch demofile1'
    sh 'ls'
    }
    }
    stage('add file'){
    steps{
    sh 'git add .'
    }
    }
    stage('commit'){
    steps{
    sh 'git commit -am "this is demo"'
    }
    }
    stage('push'){
    steps{
    sh 'git push origin master'
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

pipeline {
    agent {
        docker { image 'ubuntu:lts' }
    }
    stages {
        stage('Test') {
            steps {
                sh 'node --version'
            }
        }
    }
}
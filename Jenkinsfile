pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
       checkout scm
      }
    }
     
  stage('Stage 1') {
      steps {
        script {
          echo 'Stage 1'
        }
      }
    }
  stage('Stage 2') {
      steps {
        script {
          echo 'Stage 2'
        }
      }
    }
  }
}

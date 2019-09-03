node('anyNodeName') {
    stage('Build') {
        echo 'Building...'
        sh 'make'
    }
    stage('Test') {
        echo 'Testing...'
        sh 'make check || true'
        junit '**/target/*.xml'
    }
    stage('Deploy') {
        echo 'Deploying...'
        sh 'make publish'
    }
}

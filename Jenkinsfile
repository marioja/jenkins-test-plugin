pipeline {
    stages {
        stage('Build') {
            steps {
                withMaven() {
                	bat "mvn verify"
                }
            }
        }
    }
}
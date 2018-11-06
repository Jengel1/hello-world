pipeline {
    agent any
    stages {
        stage('checkout') {
            steps {
                checkout scm
                eco "Checkout Success"
            }
        }
        stage('build') {
            steps {
                echo "Build Success"
            }
        }
        stage('test') {
            steps {
                echo "Test Success"
            }
        }
        stage('deploy') {
            steps {
                echo "Deploy Success"
            }
        }
    }
}

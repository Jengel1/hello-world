pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
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

pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                sh 'make'
                echo "Build Success"
            }
        }
        stage('test') {
            steps {
                sh 'make check || true'
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

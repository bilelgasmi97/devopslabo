pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
         stage('Git Chekout') {
            steps {
                git branch: 'bilel', url: 'https://github.com/bilelgasmi97/devopslabo.git'
            }
        }
    }
}
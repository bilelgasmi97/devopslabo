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
         stage('Unit Testing') {
            steps {
                sh 'mvn test'
            }
        }
         stage('Integration Testing') {
            steps {
                sh 'mvn verify -DskipUnitTests'
            }
        }
        stage('Mavan Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Static Code Analytic') {
            steps {
               script{
                 withSonarQubeEnv(credentialsId: 'sonar-api-key') {
                    // some block
                    sh 'mvn clean package sonar:sonar'
                }
               }
            }
        }
        
    }
}
pipeline {
    agent any

    stages {
       /*  stage('Hello') {
            steps {
                echo 'Hello World'
            }
        } */
         stage('Git Chekout') {
            steps {
                git branch: 'bilel', url: 'https://github.com/bilelgasmi97/devopslabo.git'
            }
        }
        /*  stage('Unit Testing') {
            steps {
                sh 'mvn test'
            }
        }
         stage('Integration Testing') {
            steps {
                sh 'mvn verify -DskipUnitTests'
            }
        } */
         stage('Maven Clean') {
            steps {
                sh 'mvn clean'
            }
        }
         stage('Maven Compile') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('Maven Package') {
            steps {
                sh 'mvn package'
            }
        }
       /*  stage('Mavan Build') {
            steps {
                sh 'mvn clean install'
            }
        } */
        /* stage('StaticAnalytic') {
            steps {
               script{
                    withSonarQubeEnv(credentialsId: 'sonar-api-key') {
                         sh """mvn sonar:sonar -DskipTests \
                            -Dsonar.language=java 
                           
                            
                        """
                    }
                }
            }
        } */
         /* stage('Nexus'){
            steps{
                sh 'mvn deploy -DskipTests'
            }
        } */
        /*  stage('upload war file to nexus') {
            steps {
                script{
                    nexusArtifactUploader artifacts:
                    [
                        [
                            artifactId: 'achat',
                            classifier: '', file: 'target/achat.jar',
                            type: 'jar'
                        ]
                    ], 
                    credentialsId: 'nexus-api-auth',
                    groupId: 'tn.esprit.rh',
                    nexusUrl: '192.168.1.7:8081',
                    nexusVersion: 'nexus3',
                    protocol: 'http',
                    repository: 'demoapp-release',
                    version: '1.0'
                }
                
            }
        } */
        
    }
        
}
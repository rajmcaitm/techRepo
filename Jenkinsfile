pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Integration Tests') {
            steps {
                sh 'mvn integration-test'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t SpringBootCRUDWithSplunkIntegration-2.0.0 .'
            }
        }
        stage('Push Docker Image') {
            steps {
                sh 'docker tag SpringBootCRUDWithSplunkIntegration-2.0.0:latest rajmcaitm/SpringBootCRUDWithSplunkIntegration-2.0.0:latest'
                sh 'docker push rajmcaitm/SpringBootCRUDWithSplunkIntegration-2.0.0:latest'
            }
        }
        stage('Deploy to Production') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
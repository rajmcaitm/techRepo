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
                sh 'docker build -t my-spring-boot-dharya .'
            }
        }
        stage('Push Docker Image') {
            steps {
                sh 'docker tag my-spring-boot-dharya:latest rajmcaitm/my-spring-boot-dharya:latest'
                sh 'docker push rajmcaitm/my-spring-boot-dharya:latest'
            }
        }
        stage('Deploy to Production') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}
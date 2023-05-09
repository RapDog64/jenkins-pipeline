pipeline {
    agent any

    parameters {
         string defaultValue: 'smoke', description: '''User examples: Run by one tag: 1. \'smoke\' Run by multiple tags: 2. \'smoke | sanity\'''', name: 'TAG'
    }

    tools {
        gradle 'Gradle 6.9.4'
        allure 'Allure 2.22.0'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/RapDog64/jenkins-pipeline.git'
            }
        }
        stage('Run tests') {
            steps {
                sh "gradle clean test -DincludeTags=${params.TAG}"
            }
        }
        stage('Reports') {
            steps {
                sh "ls -l"
                allure([
                   includeProperties: false,
                   jdk: '',
                   properties: [],
                   reportBuildPolicy: 'ALWAYS',
                   results: [[path: 'build/allure-results']]
                   ])
            }
        }        
    }
}
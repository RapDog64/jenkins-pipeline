pipeline {
    agent any

 parameters {
   string defaultValue: 'smoke', description: '''Available tags: 1. smoke 2. sanity 3. regression''', name: 'TAG'
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
                sh "gradle test -DincludeTags='${params.TAG}'"
            }
        }
    }
    post {
        always {
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
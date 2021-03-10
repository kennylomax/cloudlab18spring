pipeline {
    agent any

    triggers {
        pollSCM '* * * * *'
    }
    stages {

        stage('Build') {
                    steps {
                        sh './mvnw install -DskipTests'   
                    }
                }

        stage("Fast JenkinsFile Tests") {
            parallel {
                stage('Fast') {
                    steps {
                        sh './mvnw test -Dgroups="fast"'   
                    }
                }
                stage('Slow') {
                    steps {
                        sh './mvnw test -Dgroups="slow"'                        
                    }
                }
            }
        }  
        
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh "./gradlew sonarqube"
                }
            }
        }
        
        stage("Quality gate") {
            steps {
                waitForQualityGate abortPipeline: true
            }
        }
    }
}

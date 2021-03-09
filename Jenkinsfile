pipeline {
  agent any
  stages {
    stage('Checkout') {
      steps {
        git(url: 'https://github.com/kennylomax/cloudlab18spring', branch: 'master')
      }
    }

    stage('') {
      steps {
        sh './mvnw clean install'
      }
    }

  }
}
pipeline{
  agent any
  tools{
    maven 'maven 3.9.5'
  }
  stages{
    stage('Build Maven'){
      steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/RFMC22/bootcamp-devops']]])
        sh 'mvn clean install'
      }
    }
  }
}
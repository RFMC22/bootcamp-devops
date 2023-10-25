pipeline{
  agent any
  tools{
    maven 'archivoMaven'
  }
  stages{
    stage('Build Maven'){
      steps{
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/RFMC22/bootcamp-devops']]])
        bat 'mvn clean install'
      }
    }
  }
}
pipeline{
  agent any
  tools{
    maven 'maven_3_9_5'
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
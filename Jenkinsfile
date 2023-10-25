pipeline{
  environment {
    registryCredential = 'docker-pwd'
  }
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
    stage('Build docker image'){
      steps{
        script{
          bat 'docker build -t bootcampdevops/bootcamp-devops .'
        }
      }
    }
    stage('Push imagen al hub'){
      steps{
        script{
          docker.withRegistry('', withRegistry){
            bat 'docker push bootcampdevops/bootcamp-devops'
          }
        }
      }
    }
  }
}
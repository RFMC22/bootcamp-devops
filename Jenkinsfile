pipeline{
  environment {
    registryCredential = credentials('docker-pwd')
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
    stage('Build docker imagen'){
      steps{
        script{
          bat 'docker build -t bootcampdevops/bootcamp-devops .'
        }
      }
    }
    stage('Despliegue'){
      steps{
        script{
            bat 'docker run -p 8080:8080 bootcampdevops/bootcamp-devops'
        }
      }
    }
  }
}
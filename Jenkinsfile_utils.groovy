@Library('jenkins-shared-library@master') _
import groovy.json.JsonSlurper

pipeline {
  agent any

  parameters {
      string(name: 'BASH_TIMES', defaultValue: '5', description: 'BASH_TIMES', trim: true)
      string(name: 'PYTHON_TIMES', defaultValue: '10', description: 'PYTHON_TIMES', trim: true)
  }

  environment {
      BASH_TIMES = "${params.BASH_TIMES}"
      PYTHON_TIMES = "${params.PYTHON_TIMES}"
      PYTHON_JSON = libraryResource('data.json')
  }
	
  stages {

    stage('common') {
      steps {
        script{
          def util = new org.foo.bar()
          echo "${util.getVersion(env.BUILD_NUMBER,env.GIT_COMMIT)}"
          echo "${util.showhost()}"
       }
      }
    }

  post {
    always {
      echo 'I will always run...'
    }
    success {
      script{
          echo "success"
          result = "SUCCESSFUL"
          notify(result)
        }
      }
    failure {
      script{
          echo "Failure"
          result = "FAILED"
          notify(result)
      }
    }     
  }
}

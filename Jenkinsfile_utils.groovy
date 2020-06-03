@Library('jenkins-shared-library@master') _

pipeline {
  agent any
	
  stages {

    stage('common') {
      steps {
        script{
          def util = new org.foo.utils()
		echo "${util.getVersion(env.BUILD_NUMBER,env.GIT_COMMIT)}"
		echo "${util.showhost()}"
	}
      }
    }
	  
    stage('common1') {
      steps {
        script{
          def util1 = new org.foo.utils1()
		echo "${util1.commitHash()}"
	}
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
        }
      }
    failure {
      script{
          echo "Failure"
          result = "FAILED"
      }
    }     
  }
}

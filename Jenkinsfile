pipeline {
  agent any
  stages {
    stage('first') {
      parallel {
        stage('first') {
          steps {
            echo 'first'
          }
        }

        stage('Hello') {
          steps {
            sh 'echo "Hello"'
          }
        }

      }
    }

    stage('third') {
      steps {
        echo 'third'
      }
    }

    stage('Final') {
      steps {
        sh 'echo "final"'
        sleep 3
      }
    }

  }
}
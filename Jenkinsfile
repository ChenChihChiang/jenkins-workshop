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

        stage('second') {
          steps {
            echo 'second'
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
      }
    }

  }
}
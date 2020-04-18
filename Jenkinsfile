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

      }
    }

    stage('third') {
      steps {
        echo 'third'
      }
    }

  }
}
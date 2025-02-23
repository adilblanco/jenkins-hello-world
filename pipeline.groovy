pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/adilblanco/jenkins-hello-world.git']]])
            }
        }
        stage('Install Dependencies') {
            steps {
                echo 'Installing pipenv..'
                sh '''
            pip install --user pipenv
            export PATH=$HOME/.local/bin:$PATH
            pipenv install --python 3.10
            pipenv install --dev
            '''
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests with pipenv..'
                sh '''
            export PATH=$HOME/.local/bin:$PATH
            pipenv run pytest
        '''
            }
        }
        stage('Run') {
            steps {
                echo 'Running application with pipenv..'
                sh '''
            export PATH=$HOME/.local/bin:$PATH
            pipenv run python app.py
        '''
            }
        }
    }
}

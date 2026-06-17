

pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                scp -o StrictHostKeyChecking=no -i /var/lib/jenkins/my_pem.pem target/demo-0.0.1-SNAPSHOT.jar ubuntu@32.236.235.29:/home/ubuntu/

                ssh -o StrictHostKeyChecking=no -i /var/lib/jenkins/my_pem.pem ubuntu@32.236.235.29 << 'EOF'
                    sudo fuser -k 8081/tcp
                    nohup java -jar demo-0.0.1-SNAPSHOT.jar > app.log 2>&1 &
                EOF
                '''
            }
        }
    }

}

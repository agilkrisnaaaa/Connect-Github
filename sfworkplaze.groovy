pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out code from repository...'
                // Tambahkan perintah untuk checkout kode dari repository di sini
            }
        }
        stage('Build') {
            steps {
                echo 'Building the project...'
                // Tambahkan perintah untuk build proyek di sini
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                // Tambahkan perintah untuk menjalankan test di sini
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application...'
                // Tambahkan perintah untuk deployment di sini
            }
        }
        stage('Notify') {
            steps {
                echo 'Notifying team about deployment...'
                // Tambahkan perintah untuk memberi notifikasi tim tentang deployment di sini
            }
        }
    }
}

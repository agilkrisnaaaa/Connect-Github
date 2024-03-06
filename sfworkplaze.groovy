pipeline {
    agent any
    stages {
        stage('Login SFWorkplaze') {
            steps {
                echo 'Checking out code from repository...'
                // Tambahkan perintah untuk checkout kode dari repository di sini
            }
        }
        stage('Cheking UI') {
            steps {
                echo 'Building the project...'
                // Tambahkan perintah untuk build proyek di sini
            }
        }
        stage('All Tab Work Properly') {
            steps {
                echo 'Running tests...'
                // Tambahkan perintah untuk menjalankan test di sini
            }
        }
        stage('Performance Test') {
            steps {
                echo 'Deploying the application...'
                // Tambahkan perintah untuk deployment di sini
            }
        }
        stage('Log out Apps') {
            steps {
                echo 'Notifying team about deployment...'
                // Tambahkan perintah untuk memberi notifikasi tim tentang deployment di sini
            }
        stage('Sending Email Notification') {
            steps {
                echo 'Notifying team about deployment...'
                // Tambahkan perintah untuk memberi notifikasi tim tentang deployment di sini
            }
        }
    }
}

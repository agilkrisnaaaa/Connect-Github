pipeline {
    agent any
    stages {
        stage('Login SFWorkplace') {
            steps {
                echo 'Logging in to SFWorkplace...'
                // Tambahkan perintah untuk login ke SFWorkplace di sini
            }
        }
        stage('Checking UI') {
            steps {
                echo 'Checking UI...'
                // Tambahkan perintah untuk memeriksa UI di sini
            }
        }
        stage('All Tabs Work Properly') {
            steps {
                echo 'Checking all tabs...'
                // Tambahkan perintah untuk memastikan semua tab berfungsi dengan baik di sini
            }
        }
        stage('Performance Test') {
            steps {
                echo 'Running performance tests...'
                // Tambahkan perintah untuk melakukan uji kinerja di sini
            }
        }
        stage('Logout Apps') {
            steps {
                echo 'Logging out from SFWorkplace...'
                // Tambahkan perintah untuk logout dari SFWorkplace di sini
            }
        }
        stage('Sending Email Notification') {
            steps {
                echo 'Sending email notification...'
                // Tambahkan perintah untuk mengirim email notifikasi di sini
            }
        }
    }
}

podTemplate(label: 'java',
        containers: [
                containerTemplate(name: 'chrome', image: 'openjdk:8-jdk', ttyEnabled: true, command: 'cat'),
                containerTemplate(name: 'selenium-chrome', image: 'selenoid/chrome', ttyEnabled: true, command: 'cat')
        ]) {
    node("java"){
        checkout scm
        container("chrome") {
            stage('Test') {
                sh './gradlew test'    
            }
        }
    }
}

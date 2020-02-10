podTemplate(label: 'java',
        containers: [
                containerTemplate(name: 'chrome', image: 'openjdk:8-jdk', ttyEnabled: true, command: 'cat'),
                containerTemplate(name: 'selenium-chrome', image: 'selenium/standalone-chrome:3.14', ttyEnabled: true, command: 'cat')
        ]) {
    node("java"){
        checkout scm
                container("chrome"){
                                    stage('Test') {
                                        sh 'echo java'
                                    }
                }
                container("selenium-chrome") {
                    stage('Test') {
                        sh './gradlew test'
                    }
                }
    }
}

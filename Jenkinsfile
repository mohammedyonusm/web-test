podTemplate(label: 'java',
        containers: [
                containerTemplate(name: 'chrome', image: 'openjdk:8-jdk', ttyEnabled: true, command: 'cat'),
                containerTemplate(name: 'selenium-chrome', image: 'atlassianlabs/docker-node-jdk-chrome-firefox:2019-12-02', ttyEnabled: true, command: 'cat')
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

node {
    checkout scm

    stage ('Build') {
        def jobName = env.JOB_NAME

        withEnv([
                "JAVA_HOME=${tool 'jdk1.8.0_192'}",
                "PATH+MAVEN=${tool 'Maven 3.5.3'}/bin"
        ]) {
            sh 'mvn clean install'
        }
    }
}
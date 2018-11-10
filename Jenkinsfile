node {
    checkout scm

    stage ('Build') {
        def jobName = env.JOB_NAME

        sh 'mvn clean install'
    }
}
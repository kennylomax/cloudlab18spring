pipelineJob('myspringapp') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kennylomax/cloudlab18spring.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
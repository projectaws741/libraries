pipeline
{
    agent any
    stages
    {
        stage('ContinuousDownload')
        {
            steps
            {
                git 'https://github.com/intelliqittrainings/maven.git'
            }
        }
	stage('ContinuousBuild_loans')
        {
            steps
            {
              sh 'mvn package'
            }
                
        }
	
    }
}

pipeline
{
    agent any
    stages
    {
        stage('ContinuousDownload')
        {
            steps
            {
                git 'https://github.com/projectaws741/java-17-maven-project.git'
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

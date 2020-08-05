pipeline{
   agent any
   environment{
      PATH = "/usr/share/maven/bin:$PATH"
   }   
   stages{
      stage('checking'){
         steps{
            git credentialsId: 'githubint', url: 'https://github.com/ansible777/sample-java-app.git'
         }   
         
      }
      stage('build'){
         steps{
            sh "mvn clean package"
         }
      }   
   }

}
   
   
   
  

node {
	  // Mark the code checkout 'stage'....	  
	stage 'Stage Checkout'
	
	  // Checkout code from repository and update any submodules	  checkout scm
	  sh 'git submodule update --init'  
	
	  stage 'Stage Build'
{
                    sh './gradlew --console=plain --no-daemon --info --stacktrace'
}
	
	
	  //branch name from Jenkins environment variables
//	  echo "My branch is: ${env.BRANCH_NAME}"

	  //build your gradle flavor, passes the current build number as a parameter to gradle
//	  sh "./gradlew"
//	}

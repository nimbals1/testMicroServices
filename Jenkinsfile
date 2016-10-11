node {
	  // Mark the code checkout 'stage'....
	  stage 'Stage Checkout'
	
	  // Checkout code from repository and update any submodules
	  checkout scm
	  sh 'git submodule update --init'  
	
	  stage 'Stage Build'
	
	  //branch name from Jenkins environment variables
	  echo "My branch is: ${env.BRANCH_NAME}"

	  //build your gradle flavor, passes the current build number as a parameter to gradle
	  sh "./gradlew 
	// clean assemble${flavor}Debug -PBUILD_NUMBER=${env.BUILD_NUMBER}"
	
	 
	}
	// Pulls the android flavor out of the branch name the branch is prepended with /Feature_
	@NonCPS



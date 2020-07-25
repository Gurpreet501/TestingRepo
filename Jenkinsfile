node{
	
	def buildno=BUILD_NUMBER
    def mavenHome = tool name: 'Maven', type: 'maven'
    def mavenCommand = "${mavenHome}/bin/mvn "

stage("checkout"){
git  url: 'https://github.com/Gurpreet501/TestingRepo.git'
}


stage("build"){
sh "${mavenCommand} clean package"
}

stage("docker image creation"){
  sh "docker build -t gurpreet501/testingrepo:${buildnumber} ."
}

}

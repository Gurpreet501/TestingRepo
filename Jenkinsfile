node{

    def mavenHome = tool name: 'Maven', type: 'maven'
    def mavenCommand = "${mavenHome}/bin/mvn "

stage("checkout"){
git  url: 'https://github.com/Gurpreet501/TestingRepo.git'
}


stage("build"){
sh "${mavenCommand} clean package"
}

}
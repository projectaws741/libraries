def newGit(repo){
  git "${repo}"
}
def maven(){
  sh 'mvn package'
}

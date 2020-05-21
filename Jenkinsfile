node {

stage ('SCM checkout'){
git 'https://github.com/navedbc/mapstruct'
  }
  
  stage ('Compile-Package'){
  
  sh 'mvn package'
  
  }
}

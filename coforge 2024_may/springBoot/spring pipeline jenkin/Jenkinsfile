node{
  stage('SCM Checkout'){
    git 'https://github.com/shankar-trainer/test1'
  }
  
  stage('Compile-Package Test'){
    def mvnHome=tool name: 'maven', type: 'maven'
   // sh '${mvnHome}/bin/mvn  clean compile test'
   // window use bat    
   bat '${mvnHome}/bin/mvn  clean compile test'
  }
  
  /*stage('Test'){
   tool name: 'maven', type: 'maven'
   sh '${mvnHome}/bin/mvn test'
  }
  */
  
}


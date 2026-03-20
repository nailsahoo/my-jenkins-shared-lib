def call(String imageName){
  echo "buliding image name :${imageName}"
  sh "docker build -t ${imageName} ."
}

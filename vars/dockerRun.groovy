def call(String imageName){
  echo "Running container from image: ${imageName}"

  sh """
    docker stop todo-container || true
    docker rm todo-container || true
    docker run -d -p 5000:5000 --name todo-container ${imageName}
    """
}

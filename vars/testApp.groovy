def call() {
    echo "Testing application..."

    sh "curl -I http://localhost:5000 || true"
}

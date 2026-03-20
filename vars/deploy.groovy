def call(String env) {
    echo "🚀 Deploying to ${env} environment"

    if (env == "dev") {
        sh "kubectl apply -f k8s/dev/"
    } else if (env == "prod") {
        sh "kubectl apply -f k8s/prod/"
    }
}

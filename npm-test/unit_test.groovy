void call() {
    nodejs('NodeJS 10') {
        sh "npm ci"
        sh "npm test"
    }
}
void call() {
    nodejs('NodeJS 10') {
        sh "npm run build"
    }
}
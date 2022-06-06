def call(repo, branch) {
    steps {

        git(
            url: "${repo}",
            credentialsId: 'github_user',
            branch: "${branch}"
        )
        
    }
}

  
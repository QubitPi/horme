/**
 * Builds, (re)creates, starts, and attaches to containers for a service.
 *
 * @param projectName  Project name
 * @return not used
 */
def call(String projectName) {
    this.sh("docker compose --project-name ${projectName} up --build --force-recreate -d")
}

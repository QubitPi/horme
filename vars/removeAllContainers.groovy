/**
 * Force stops (using SIGKILL) and removes all containers whose names matches a specified regex.
 *
 * For example: removeAllContainers("my-container-name")
 *
 * @param containerNameRegex  A container names regex or simply a container name substring
 * @return not used
 */
def call(String containerNameRegex) {
    this.sh("docker ps -a --format \"{{.Names}}\" | grep ${containerNameRegex} | xargs -r docker rm -f")
}

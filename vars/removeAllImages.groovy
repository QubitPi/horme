/**
 * Removes all images whose names matches a specified regex.
 *
 * For example: removeAllImages("my-image-name")
 *
 * @param imageNameRegex  An image names regex or simply a image name substring
 * @return not used
 */
def call(String imageNameRegex) {
    this.sh("docker images --format \"{{.Repository}}\" | grep ${imageNameRegex} | xargs -r docker rmi")
}

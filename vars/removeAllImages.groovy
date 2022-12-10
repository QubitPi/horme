/**
 * Removes all images whose names matches a specified regex.
 *
 * For example: removeAllImages("my-image-name")
 *
 * @param imageNameRegex  An image names regex or simply a image name substring
 * @return not used
 */
def call(String imageNameRegex) {
    this.sh("docker images | grep ${imageNameRegex} | awk '{ print \$3; }' | xargs -r docker rmi")
}

[ ![License Badge](https://img.shields.io/badge/Apache%202.0-F25910.svg?style=for-the-badge&logo=Apache&logoColor=white) ](https://www.apache.org/licenses/LICENSE-2.0)
![GitHub last commit (branch)](https://img.shields.io/github/last-commit/QubitPi/horme/master?logo=github&style=for-the-badge)

Horme
=====

Horme is a "[Shared Library](https://www.jenkins.io/doc/book/pipeline/shared-libraries/)" which can be imported as an 
external source control repositories and loaded into existing Jenkins Pipelines.

The version of Horme used in Jenkins will be "master"


Custom Steps
------------

Horme defines global variables which behave similarly to built-in steps, such as `sh` or `git`:

- [**docker compose up** with a specified project name](./vars/composeUp.groovy)
- [Removes Docker images by name or regex pattern](./vars/removeAllImages.groovy)
- [Force stops and removes Docker containers by name or regex pattern](./vars/removeAllContainers.groovy)


License
-------

The use and distribution terms for [Horme](https://github.com/QubitPi/horme) are covered by the
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html).

<div align="center">
    <a href="https://opensource.org/licenses">
        <img align="center" width="50%" alt="License Illustration" src="https://github.com/QubitPi/QubitPi/blob/master/img/apache-2.png?raw=true">
    </a>
</div>

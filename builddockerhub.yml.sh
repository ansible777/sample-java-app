version: 0.2
phases:
  install:
    commands:
      - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://127.0.0.1:2375 --storage-driver=overlay2&
      - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"
  pre_build:
    commands:
      - echo $DOCKER_USER
      - docker login --username keerthimure --password keerthi777
  build:
    commands:
      - docker build -t keerthimure/sample-java-application .
  post_build:
    commands:
      - docker push keerthimure/sample-java-application
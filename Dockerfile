FROM openjdk:11

RUN mkdir /ArkanoidJar

WORKDIR /ArkanoidJar

RUN apt-get update 
RUN apt-get install curl
RUN apt-get install -y libxrender1 libxtst6 libxi6

RUN  curl -L -H "Accept: application/vnd.github.v3+json" -H "Authorization: {token} " https://api.github.com/repos/Spirito9/Arkanoid/actions/artifacts/41302058/zip --output Arkanoid.zip

RUN unzip Arkanoid.zip

CMD ["java", "-jar", "Arkanoid-1.0.jar"]
FROM openjdk:11

RUN apt-get update -y
RUN apt-get install zip -y
RUN echo "deb http://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list
RUN curl -sL "https://keyserver.ubuntu.com/pks/lookup?op=get&search=0x2EE0EA64E40A89B84B2DF73499E82A75642AC823" | apt-key add
RUN apt-get update -y
RUN apt-get install sbt -y

EXPOSE 8080

COPY run.sh /run.sh

ENTRYPOINT ["bash","/run.sh"]

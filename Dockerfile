FROM openjdk:11
COPY . /app
WORKDIR /app/bin
CMD ["java","sep_internship_code.DockerRun"]
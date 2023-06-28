Steps to run the containers with all edge nodes:

1. Build the facility-api and the aggregation-api. Navigate into the project folders individually and run command `mvn clean install` to create the jar files for both the spring boot apis.
2. Go to root folder and run command `docker-compose up` to bring up all containers.
3. When the rabbitMQ container is up, navigate to the terminal for rabbitMQ and run command `rabbitmqctl change_password guest guest` to override default password so that other APIS can authenticate with the queue.

#### To verify that Kafka and Zookeeper are running, you can use the following commands:

Check the running containers:

`docker ps`

You should see both the Zookeeper and Kafka containers listed.

#### To check Kafka logs:

`docker logs <kafka-container-id>`

#### Replace <kafka-container-id> with the actual container ID from the docker ps output.

## Interact with Kafka


### You can use Kafka's command-line tools to interact with your Kafka instance. For example, to create a topic:

`docker exec -it <kafka-container-id> \`

`kafka-topics.sh --create --topic my_topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1`

### To produce a message to a topic:

`docker exec -it <kafka-container-id> \`

`kafka-console-producer.sh --topic my_topic --bootstrap-server localhost:9092`

### To consume messages from a topic:


`docker exec -it <kafka-container-id> \`

`kafka-console-consumer.sh --topic my_topic --bootstrap-server localhost:9092 --from-beginning`

This setup allows you to run Kafka and Zookeeper on your local machine without installing them directly, leveraging Docker to handle the dependencies and environment.
# kafkaPractice
This project was created following this tutorial

https://www.youtube.com/watch?v=SqVfCyfCJqw&ab_channel=Amigoscode

# Usage

Follow step 1 and 2 from here

https://kafka.apache.org/quickstart

Download and extract kafka, browse to that directory then run the following commands

(I had to uncomment and set advertised.listeners=PLAINTEXT://<my ip>:9092 in server.properties in the config dir in kafaka to get it to run) 

1) Start the ZooKeeper service
  
  $ bin/zookeeper-server-start.sh config/zookeeper.properties

2) Start the Kafka broker service
  
  $ bin/kafka-server-start.sh config/server.properties

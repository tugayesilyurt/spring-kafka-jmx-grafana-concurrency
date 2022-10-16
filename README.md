# Spring Boot,Kafka,Kafka UI,JMX,Grafana,Prometheus example

Technologies
------------
- `Spring Boot`
- `Apache Kafka` 
- `Grafana`
- `Prometheus`
- `Kafka UI`
- `JMX`
- `Docker-Compose`
- `Lombok`
- `CommandLineRunner`

## Run the System

We can easily run the whole with only a single command:

* `docker-compose up -d`

#### 5: Starting redis-publisher`

```shell
./kafka-consumer
mvn spring-boot:run
```

#### 5: Starting redis-subscriber-one`

```shell
./kafka-producer
mvn spring-boot:run
```


- **Concurrency Performence**

![Concurrency Performence](https://github.com/tugayesilyurt/spring-kafka-jmx-grafana-concurrency/blob/main/assets/performence.PNG)

- **Kafka UI**

![Kafka UI](https://github.com/tugayesilyurt/spring-kafka-jmx-grafana-concurrency/blob/main/assets/kafkaui.PNG)

- **Grafana**

![Grafana](https://github.com/tugayesilyurt/spring-kafka-jmx-grafana-concurrency/blob/main/assets/grafana.PNG)

- **Prometheus**

![Prometheus](https://github.com/tugayesilyurt/spring-kafka-jmx-grafana-concurrency/blob/main/assets/prometheus.PNG)
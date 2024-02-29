package kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    //логирование для проверки работы потоков (id потока, сообщение, номер партиции)
    @KafkaListener(topics = "logs", groupId = "logs-group")
    public void listenOne(ConsumerRecord<?,?> record) {
        log.info("Thread ID : " + Thread.currentThread().getId() + " reading message: " + record);
    }
}
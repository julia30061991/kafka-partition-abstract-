package kafka.producer;

import kafka.config.KafkaSender;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private final String TOPIC_NAME = "logs";

    private final KafkaSender sender;

    public KafkaProducer(KafkaSender sender) {
        this.sender = sender;
    }

    public void sendWebLog() {
        int x = (int) (Math.random() * 5);
        sender.sendMessage(TOPIC_NAME, "Some web action from user: " + x);
    }
}
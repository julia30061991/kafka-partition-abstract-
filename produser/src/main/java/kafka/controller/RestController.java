package kafka.controller;

import kafka.producer.KafkaProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final KafkaProducer producer;

    public RestController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send/log")
    public ResponseEntity<Object> sendLog() {
        producer.sendWebLog();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
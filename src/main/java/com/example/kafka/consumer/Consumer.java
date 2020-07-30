package com.example.kafka.consumer;

import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.Thread.sleep;

/**
 * @author wangwentao
 * @date 2020/7/29 14:52
 */
@Log4j2
@Service
public class Consumer {

    @KafkaListener(topics = "topic-demo")
    public void listen(ConsumerRecord<?, ?> record) throws Exception {
        log.info("topic = {},offset = {},value = {}", record.topic(), record.offset(), record.value());
        sleep(10000);
        log.info("睡了10秒");
    }
}

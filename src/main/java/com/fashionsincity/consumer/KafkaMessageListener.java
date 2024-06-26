package com.fashionsincity.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fashionsincity.dto.Customer;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "topic2",groupId = "topic-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

    
    //@KafkaListener( topicPartitions = @org.springframework.kafka.annotation.TopicPartition(topic = "topic1", partitions = {"2"}),groupId = "topic-group") //how to consume msg from specific partition2 here
//    @KafkaListener(topics = "topic1",groupId = "topic-group")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "topic1",groupId = "topic-group")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "topic1",groupId = "topic-group")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
    
    
}

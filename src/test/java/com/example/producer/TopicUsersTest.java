package com.example.producer;

import com.example.producer.dto.User;
import com.example.producer.message.Message;
import com.example.producer.message.UserSchema;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootTest
class TopicUsersTest {

    @Value("${kafka.topic.name}")
    private String topicName;

    @Autowired
    KafkaTemplate<String, Message> kafkaTemplate;

    @Test
    void testProduceMessageToUsers() {
        User user = new User(1493819497170L, "User_10", "Region_5", "MALE");
        Message<User, UserSchema> message = new Message<>(UserSchema.instance, user);
        kafkaTemplate.send(topicName, message);
    }

}

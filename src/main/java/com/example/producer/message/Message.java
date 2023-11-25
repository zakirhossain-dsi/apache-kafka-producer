package com.example.producer.message;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message<T, S> {
    private S schema;
    private T payload;
}

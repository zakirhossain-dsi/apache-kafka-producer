package com.example.producer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
public class Field {

    @JsonProperty("field")
    private String fieldName;

    @JsonProperty("type")
    private String fieldType;

    private Boolean optional;
}

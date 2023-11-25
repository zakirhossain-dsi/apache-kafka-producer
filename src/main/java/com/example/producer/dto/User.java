package com.example.producer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    @JsonProperty("registertime")
    private Long registerTime;

    @JsonProperty("userid")
    private String userId;

    @JsonProperty("regionid")
    private String regionId;

    private String gender;
}

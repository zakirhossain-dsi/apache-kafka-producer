package com.example.producer.message;

import lombok.Data;

import java.util.List;

@Data
public class UserSchema {
    public static final UserSchema instance = new UserSchema();

    private String type;
    private List<Field> fields;

    private UserSchema(){
        Field registerTime = new Field("registertime", "int64", false);
        Field userId = new Field("userid", "string", false);
        Field regionId = new Field("regionid", "string", false);
        Field gender = new Field("gender", "string", false);
        this.type = "struct";
        this.fields = List.of(registerTime, userId, regionId, gender);
    }
}

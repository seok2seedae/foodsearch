package com.example.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
    private String name;
    private Integer age;

    @Builder.Default
    private List<Car> cars = new ArrayList<>();

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Builder
    public static class Car {
        private String name;
        @JsonProperty(value = "car_num")
        private String carNum;
        @JsonProperty(value = "owner")
        private boolean isOwner;
    }
}

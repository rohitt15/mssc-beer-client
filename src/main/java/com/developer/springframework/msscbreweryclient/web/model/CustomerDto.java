
package com.developer.springframework.msscbreweryclient.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

/*
Created by Rohit on 26-10-2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private UUID uuid;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
package com.example.RestResponse.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsDTO {

    private int id;
    private String name;

    private Character gender;


}

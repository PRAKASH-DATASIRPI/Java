package com.example.GeneratePDF.DTO;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UserDTO {
    private int id;


    private String bookTitle;


    private String author;
}

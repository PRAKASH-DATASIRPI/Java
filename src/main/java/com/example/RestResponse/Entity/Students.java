package com.example.RestResponse.Entity;

import com.example.RestResponse.DTO.StudentsDTO;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name= "StudentsDTO")


public class Students {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id ;
   @Column (name="name")
    private String name;
   @Column(name="gender")
    private Character gender;

}

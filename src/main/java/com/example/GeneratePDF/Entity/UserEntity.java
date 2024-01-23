package com.example.GeneratePDF.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name= "Books")


public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")

    private int id;
    @Column(name = "book_title")

    private String bookTitle;

    @Column(name = "author")
    private String author;

    public String getId() {
        return null;
    }

    public String getBookTitle() {
        return null;
    }
}




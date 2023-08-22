package com.OneToMany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booktable")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "PublicationName")
    private String publication;
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = Author.class)
    private Author author;

}

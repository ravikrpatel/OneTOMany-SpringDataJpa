package com.OneToMany.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Authortable")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "firstname")
    private String firsname;
    @Column(name = "bookname")
    private String bookname;
    @OneToMany(mappedBy = "author",targetEntity = Book.class)
    private List<Book> book;
}

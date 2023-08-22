package com.OneToMany.Services;

import com.OneToMany.Entity.Book;
import com.OneToMany.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicesClass {

    @Autowired
    private BookRepository bookRepository;


    public Book savebook(Book book) {
       return bookRepository.save(book);
    }
}

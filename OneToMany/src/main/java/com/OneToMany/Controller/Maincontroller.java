package com.OneToMany.Controller;

import com.OneToMany.Entity.Book;
import com.OneToMany.Services.ServicesClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Maincontroller {

    @Autowired
    private ServicesClass servicesClass;
    @PostMapping("/savebook")
    public Book savebook(@RequestBody Book book){
        return servicesClass.savebook(book);
    }

}

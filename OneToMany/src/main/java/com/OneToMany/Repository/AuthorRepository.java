package com.OneToMany.Repository;

import com.OneToMany.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository  extends JpaRepository<Author, Integer> {
}

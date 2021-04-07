package com.sinanaldmr.librarymanagementapi.Dao;

import com.sinanaldmr.librarymanagementapi.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends JpaRepository<Book, Long> {
}

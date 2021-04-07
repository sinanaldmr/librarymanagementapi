package com.sinanaldmr.librarymanagementapi.Dao;

import com.sinanaldmr.librarymanagementapi.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorDao extends JpaRepository<Author, Long> {
}

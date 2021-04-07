package com.sinanaldmr.librarymanagementapi.Dao;

import com.sinanaldmr.librarymanagementapi.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherDao extends JpaRepository<Publisher, Long> {
}

package com.sinanaldmr.librarymanagementapi.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publisherId;
    private String publisherName;
    private String publisherDescription;
    /*
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId", nullable = true)
    @JsonIgnore
    private List<Book> books;
*/
    public Publisher() {
    }

    public Publisher(Long publisherId, String publisherName, String publisherDescription) {
        this.publisherId = publisherId;
        this.publisherName = publisherName;
        this.publisherDescription = publisherDescription;
        //this.books = books;
    }

    public Long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Long publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPublisherDescription() {
        return publisherDescription;
    }

    public void setPublisherDescription(String publisherDescription) {
        this.publisherDescription = publisherDescription;
    }
/*
    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

 */
}

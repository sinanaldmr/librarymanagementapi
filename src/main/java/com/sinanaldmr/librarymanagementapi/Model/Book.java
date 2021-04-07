package com.sinanaldmr.librarymanagementapi.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="book")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    private String bookIsbn;
    private String bookName;
    private String bookSubName;
    private String bookSeriesName;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "authorId", nullable = true)
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "publisherId",nullable = true)
    private Publisher publisher;
    private String bookDescription;

    public Book() {
    }

    public Book(Long bookId, String bookIsbn, String bookName, String bookSubName, String bookSeriesName, Author author, Publisher publisher, String bookDescription) {
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.bookName = bookName;
        this.bookSubName = bookSubName;
        this.bookSeriesName = bookSeriesName;
        this.author = author;
        this.publisher = publisher;
        this.bookDescription = bookDescription;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String ISBN) {
        this.bookIsbn = bookIsbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSubName() {
        return bookSubName;
    }

    public void setBookSubName(String bookSubName) {
        this.bookSubName = bookSubName;
    }

    public String getBookSeriesName() {
        return bookSeriesName;
    }

    public void setBookSeriesName(String bookSeriesName) {
        this.bookSeriesName = bookSeriesName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
}

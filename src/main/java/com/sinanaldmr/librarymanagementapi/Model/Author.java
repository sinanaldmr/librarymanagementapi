package com.sinanaldmr.librarymanagementapi.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;
    private String authorName;
    private String authorDescription;
/*
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId", nullable = true)
    @JsonIgnore
    private List<Book> books;

 */

    public Author() {
    }

    public Author(Long authorId, String authorName, String authorDescription) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorDescription = authorDescription;
       // this.books = books;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorDescription() {
        return authorDescription;
    }

    public void setAuthorDescription(String authorDescription) {
        this.authorDescription = authorDescription;
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

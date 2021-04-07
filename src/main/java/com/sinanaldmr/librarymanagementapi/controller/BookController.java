package com.sinanaldmr.librarymanagementapi.controller;


import com.sinanaldmr.librarymanagementapi.Model.Book;
import com.sinanaldmr.librarymanagementapi.Service.BookService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bookApi/book/")
public class BookController {

    @Resource
    private BookService bookService;

    @PostMapping(value = "save",produces = "application/json",consumes = "application/json")
    public void save(@RequestBody Book book){
        bookService.saveBook(book);
    }
    @PostMapping(value = "update", produces = "application/json", consumes = "application/json")
    public void update(@RequestBody Book book){
        bookService.updateBook(book);
    }
    @PostMapping(value = "delete",produces = "application/json",consumes = "application/json")
    public void delete(@RequestBody Long id){
        bookService.deleteBook(id);
    }
    @GetMapping(value = "getAll")
    public List<Book> getAll(){
        return bookService.getAll();
    }

}

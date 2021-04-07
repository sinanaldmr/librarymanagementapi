package com.sinanaldmr.librarymanagementapi.controller;

import com.sinanaldmr.librarymanagementapi.Model.Author;
import com.sinanaldmr.librarymanagementapi.Service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bookApi/author/")
public class AuthorController {
    @Resource
    private AuthorService authorService;

    @PostMapping(value = "save",produces = "application/json",consumes = "application/json")
    public void save(@RequestBody Author author){
        authorService.saveAuthor(author);
    }

    @PostMapping(value = "update",produces = "application/json",consumes = "application/json")
    public void update(@RequestBody Author author){
        authorService.updateAuthor(author);
    }

    @PostMapping(value = "delete",produces = "application/json",consumes = "application/json")
    public void delete(@RequestBody Long id){
        authorService.deleteAuthor(id);
    }

    @PostMapping(value = "getAll",produces = "application/json",consumes = "application/json")
    public List<Author> getAll(){
        return authorService.findAuthors();
    }
}

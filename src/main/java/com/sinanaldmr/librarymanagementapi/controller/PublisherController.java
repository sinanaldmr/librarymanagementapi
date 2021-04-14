package com.sinanaldmr.librarymanagementapi.controller;

import com.sinanaldmr.librarymanagementapi.Model.Publisher;
import com.sinanaldmr.librarymanagementapi.Service.PublisherService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/bookApi/publisher/")
public class PublisherController {
    @Resource
    private PublisherService publisherService;
    @PostMapping(value = "save",produces = "application/json",consumes = "application/json")
    public void save(@RequestBody Publisher publisher){
        publisherService.savePublisher(publisher);
    }

    @PostMapping(value = "update",produces = "application/json",consumes = "application/json")
    public void update(@RequestBody Publisher publisher){
        publisherService.updatePublisher(publisher);
    }

    @PostMapping(value = "delete",produces = "application/json",consumes = "application/json")
    public void delete(@RequestBody Long id){
        publisherService.deletePublisher(id);
    }

    @GetMapping(value = "getAll")
    public List<Publisher> getAll(){return publisherService.findPublishers(); }
}

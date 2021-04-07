package com.sinanaldmr.librarymanagementapi.Service;

import com.sinanaldmr.librarymanagementapi.Dao.PublisherDao;
import com.sinanaldmr.librarymanagementapi.Model.Publisher;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class PublisherService {
    @Resource
    private PublisherDao publisherDao;

    public void savePublisher(Publisher publisher){
        try {
            publisherDao.save(publisher);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void updatePublisher(Publisher publisher){
        Optional<Publisher> uPublisher=publisherDao.findById(publisher.getPublisherId());
        uPublisher.get().setPublisherName(publisher.getPublisherName());
        uPublisher.get().setPublisherDescription(publisher.getPublisherDescription());
        //uPublisher.get().setBooks(publisher.getBooks());
        try {
            publisherDao.save(uPublisher.get());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void deletePublisher(Long id){
        try {
            publisherDao.deleteById(id);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public List<Publisher> findPublishers(){
        try {
            return publisherDao.findAll();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}

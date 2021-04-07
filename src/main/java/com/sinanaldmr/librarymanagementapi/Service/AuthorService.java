package com.sinanaldmr.librarymanagementapi.Service;

import com.sinanaldmr.librarymanagementapi.Dao.AuthorDao;
import com.sinanaldmr.librarymanagementapi.Model.Author;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    @Resource
    private AuthorDao authorDao;

    public void saveAuthor(Author author){
        try {
            authorDao.save(author);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void updateAuthor(Author author){
        Optional<Author> uAuthor=authorDao.findById(author.getAuthorId());
        uAuthor.get().setAuthorName(author.getAuthorName());
        uAuthor.get().setAuthorDescription(author.getAuthorDescription());
        //uAuthor.get().setBooks(author.getBooks());
        try {
            authorDao.save(uAuthor.get());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void deleteAuthor(Long id){
        try {
            authorDao.deleteById(id);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public List<Author> findAuthors(){
        try {
            return authorDao.findAll();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
}

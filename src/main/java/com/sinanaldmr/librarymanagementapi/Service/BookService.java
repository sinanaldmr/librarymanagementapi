package com.sinanaldmr.librarymanagementapi.Service;

import com.sinanaldmr.librarymanagementapi.Dao.BookDao;
import com.sinanaldmr.librarymanagementapi.Model.Book;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Resource
    private BookDao bookDao;

    public void saveBook(Book book){
        try {
            bookDao.save(book);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void updateBook(Book book){
        Optional<Book> uBook=bookDao.findById(book.getBookId());
        uBook.get().setIsbn(book.getIsbn());
        uBook.get().setBookName(book.getBookName());
        uBook.get().setBookSubName(book.getBookSubName());
        uBook.get().setBookSeriesName(book.getBookSeriesName());
        uBook.get().setAuthor(book.getAuthor());
        uBook.get().setPublisher(book.getPublisher());
        uBook.get().setBookDescription(book.getBookDescription());
        try {
            bookDao.save(uBook.get());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public void deleteBook(Long id){
        try {
            bookDao.deleteById(id);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public List<Book> getAll(){
        try {
            return bookDao.findAll();
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }

}

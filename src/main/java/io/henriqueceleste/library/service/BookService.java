package io.henriqueceleste.library.service;

import io.henriqueceleste.library.converter.BookToBookDto;
import io.henriqueceleste.library.dao.BookDao;
import io.henriqueceleste.library.dto.BookDto;
import io.henriqueceleste.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Book get(Integer id) {
        return bookDao.findById(id);
    }

    public List<Book> list() {
        return bookDao.findAll();
    }

    @Transactional
    public Book save(Book book) {
        return bookDao.saveOrUpdate(book);
    }

    @Transactional
    public void delete(Integer id) {
        bookDao.delete(id);
    }
}

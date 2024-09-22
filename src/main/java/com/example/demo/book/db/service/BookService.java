package com.example.demo.book.db.service;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.db.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    public final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // create, update
    public BookEntity create(BookEntity book) {
        return bookRepository.save(book);
    }
    // all
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }


    // find one
    public Optional<BookEntity> findById(Long id) {
        return bookRepository.findById(id);
    }

    // delete
    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

//    public List<BookEntity> filterCategoryAndAmount(String category, BigDecimal amount) {
//        return bookRepository.findAllCategoryMatchAndGreaterThanAmount(category, amount);
//    }

}

package com.example.demo.book.db.controller;

import com.example.demo.book.db.entity.BookEntity;
import com.example.demo.book.db.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {
    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(
            @RequestBody BookEntity bookEntity
    ) {
        return  bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/id/{id}")
    public Optional<BookEntity> findById(
            @PathVariable Long id
    ) {
        return bookService.findById(id);
    }

    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ) {
        bookService.delete(id);
    }

//    @GetMapping("/categoryWithAmount")
//    public List<BookEntity> filterCategoryAndAmount(
//            @RequestParam String category,
//            @RequestParam BigDecimal amount
//    )
//    {
//        return bookService.filterCategoryAndAmount(category, amount);
//    }

}

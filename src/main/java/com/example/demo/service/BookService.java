package com.example.demo.service;

import com.example.demo.model.BookDetail;
import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public BookService() {
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @PostConstruct
    public void loadData()
    {
        Book book=new Book("Java",new BookDetail(134));
        bookRepository.save(book);

    }



}

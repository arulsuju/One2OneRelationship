package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Entity
public class BookDetail implements Serializable {
    private int noOfPages;

    @Id
    @OneToOne
    @JoinColumn(name="id")
    private Book book;


    public BookDetail() {
    }
    public BookDetail(int noOfPages)
    {
        this.noOfPages=noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "noOfPages=" + noOfPages +
                ", book=" + book +
                '}';
    }
}

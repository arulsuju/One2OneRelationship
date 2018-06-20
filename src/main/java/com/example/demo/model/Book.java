package com.example.demo.model;



import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Book implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String bookName;

    @OneToOne(mappedBy = "book")
    private BookDetail bookDetail;

    public Book() {
    }
    public Book(String bookName) {

        this.bookName=bookName;
    }

    public Book(String bookName,BookDetail bookDetail) {
        this.bookName=bookName;
        this.bookDetail=bookDetail;
        this.bookDetail.setBook(this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


    public BookDetail getBookDetail() {
        return bookDetail;
    }

    public void setBookDetail(BookDetail bookDetail) {
        this.bookDetail = bookDetail;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookDetail=" + bookDetail +
                '}';
    }
}

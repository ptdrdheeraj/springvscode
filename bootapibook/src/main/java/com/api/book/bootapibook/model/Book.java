package com.api.book.bootapibook.model;

public class Book {
    
    private int id;
    private String bookname;

    public Book() {
    }
    private String Author;
    
    
    public int getId() {
        return id;
    }
    public Book(int id, String bookname, String author) {
        this.id = id;
        this.bookname = bookname;
        Author = author;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    @Override
    public String toString() {
        return "Book [id=" + id + ", bookname=" + bookname + ", Author=" + Author + "]";
    }
   

    
    
}

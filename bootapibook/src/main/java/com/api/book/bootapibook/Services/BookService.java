package com.api.book.bootapibook.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Component;
import com.api.book.bootapibook.model.Book;

@Component
public class BookService {
    
    private static List<Book> list = new ArrayList<>();
    static{
        list.add(new Book(123,"java complete refrence","Xyz"));
        list.add(new Book(1232,"java complete ","jkl"));
        list.add(new Book(1233,"java  ","Abc"));

    }

    //getall books
    public List<Book> getAllBook(){

        return list;
    }

    //getsingle book byid
    public Book getBookbyId(int id){
        Book book =null;
        book=list.stream().filter(e-> e.getId()==id).findFirst().get();

        return book;
    }

    //adding the book 
    public Book addBook(Book b){
        
        list.add(b);     
       return b;
        
    }

    //delete book
    public void deleteBook(int bid){

        list=list.stream().filter(book->book.getId()!=bid).
        collect(Collectors.toList());//filter book.getId() ko, bid se match krega agar match nhi hui to hi return true krega or usko collect krenge.or list update krenge 
    }

    //update book 
    public void updateBook(Book book,int bookid){

       list =  list.stream().map(b->{
            if(b.getId()==bookid){

                b.setBookname(book.getBookname());
                b.setAuthor(book.getAuthor());

            }
            return b;
        }).collect(Collectors.toList());
    }
}

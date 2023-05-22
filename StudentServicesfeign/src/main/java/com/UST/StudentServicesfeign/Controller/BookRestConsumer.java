package com.UST.StudentServicesfeign.Controller;

import com.UST.StudentServicesfeign.Model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name ="BOOK-SERVICE")
public interface BookRestConsumer {

    @GetMapping("/Book/data")
    public  String getBookData();
    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable Integer id);
    @GetMapping("/Book/all")
    public List<Book> getAllBooks();
    @GetMapping("/Book/entity")
    public ResponseEntity<String> getEntityData();


}

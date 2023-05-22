package com.UST.BookServicesfeign.Controller;

import com.UST.BookServicesfeign.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {
    @Autowired
    Environment environment;
    @GetMapping("/data")
    public String getBookData(){
        return  "data of BOOK-SERVICE, Running on port : "
                +environment.getProperty("local.server.port");
    }
    @GetMapping("/{id}")
    public Book getBookId(@PathVariable Integer id){
        return new Book(id,"agk the good boy",590.23);
    }
    @GetMapping("/all")
    public List<Book> getAll(){
        return List.of(new Book(501,"agk the good boy",590.23),
                new Book(502,"abk the good boy",650.23),
                new Book(503,"sassi the good boy",588.23)
        );

    }
    @GetMapping("/entity")
    public ResponseEntity<String> getEntityData(){
        return new ResponseEntity<String>("Hello from BookRestController",
                HttpStatus.OK);
    }

}

package com.cg.Lib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.Lib.entities.Books;


@Service
public class LibService {
     
    @Autowired(required=false)
    private RestTemplate restTemplate;
 
    public Books getBooksByid(int bookid) {
    ResponseEntity<Books> resp = 
          restTemplate.getForEntity("http://localhost:9003/getbooks/" + bookid, Books.class);
         
    return resp.getStatusCode() == HttpStatus.OK ? resp.getBody() : null;
    
    }
}
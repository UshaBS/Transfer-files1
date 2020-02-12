package com.cg.Lib;

import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cg.Lib.entities.Books;
import com.cg.Lib.service.LibService;

@RunWith(MockitoJUnitRunner.class)
public class LibServiceTest {
 
    @Mock
    private RestTemplate restTemplate;
 
    @InjectMocks
    private LibService libService;
 
    @Test
    public void getBooksByid() {
        Books book = new Books();
        book.setBookId(5); 
              
        when(restTemplate.getForEntity(Mockito.anyString(),Mockito.<Class<Books>>any()))
        .thenReturn(new ResponseEntity<Books>(book, HttpStatus.OK));
        
        
        Books books = libService.getBooksByid(5);
        
        Assert.assertEquals(book, books);
    }
}
package com.exercise.exercise.controller;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StringControllerTest {

    public static final String API_STRING = "/string";


    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    @Order(1)
    void gerReversed_whenRequest_returnOk() {
        String message = "123";
        ResponseEntity<String> httpResponse = testRestTemplate.postForEntity(API_STRING  + "/reverce",
                message,
                String.class);
        Assertions.assertEquals(HttpStatus.OK, httpResponse.getStatusCode());
    }

    @Test
    @Order(2)
    void gerReversed_whenRequest_returnReversedString() {
        String message = "Hello world";
        ResponseEntity<String> httpResponse = testRestTemplate.postForEntity(API_STRING  + "/reverce",
                message,
                String.class);
        Assertions.assertEquals("dlrow olleH", httpResponse.getBody().toString());
    }
}
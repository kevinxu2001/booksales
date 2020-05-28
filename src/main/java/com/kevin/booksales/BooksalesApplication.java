package com.kevin.booksales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class BooksalesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksalesApplication.class, args);
    }

}

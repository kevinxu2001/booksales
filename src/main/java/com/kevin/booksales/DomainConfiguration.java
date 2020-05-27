package com.kevin.booksales;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.kevin.booksales.infrastructure.repository", "com.kevin.booksales.infrastructure.mapper"})
@MapperScan("com.kevin.demo.infrastructure.mapper")
public class DomainConfiguration {
}

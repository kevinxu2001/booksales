package com.kevin.booksales.infrastructure.mapper;

import com.kevin.booksales.domain.book.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper extends BaseMapper<Book>{

}
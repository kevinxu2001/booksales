package com.kevin.booksales.infrastructure.mapper;

import com.kevin.booksales.domain.order.Bookorder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookorderMapper extends BaseMapperString<Bookorder> {
}
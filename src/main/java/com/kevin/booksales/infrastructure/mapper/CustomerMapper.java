package com.kevin.booksales.infrastructure.mapper;

import com.kevin.booksales.domain.customer.Customer;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer>{

}
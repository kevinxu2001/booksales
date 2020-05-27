package com.kevin.booksales.infrastructure.repository;

import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.domain.customer.CustomerRepository;
import com.kevin.booksales.infrastructure.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {

    }

    @Override
    public void insert(Customer customer) {

    }

    @Override
    public int insertSelective(Customer customer) {
        return 0;
    }

    @Override
    public Customer selectByPrimaryKey(Integer id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(Customer customer) {

    }

    @Override
    public void updateByPrimaryKey(Customer customer) {

    }

    @Override
    public List<Customer> selectAll() {
        return null;
    }

}

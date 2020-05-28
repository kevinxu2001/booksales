package com.kevin.booksales.infrastructure.repository;

import com.kevin.booksales.domain.order.Bookorder;
import com.kevin.booksales.domain.order.BookorderRepository;
import com.kevin.booksales.infrastructure.mapper.BookorderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookorderRepositoryImpl implements BookorderRepository {

    @Autowired
    private BookorderMapper bookorderMapper;

    @Override
    public void deleteByPrimaryKey(String id) {

    }

    @Override
    public void insert(Bookorder bookorder) {
        bookorderMapper.insert(bookorder);
    }

    @Override
    public int insertSelective(Bookorder bookorder) {
        return 0;
    }

    @Override
    public Bookorder selectByPrimaryKey(String id) {

        return bookorderMapper.selectByPrimaryKey(id);
    }


    @Override
    public void updateByPrimaryKeySelective(Bookorder bookorder) {

    }

    @Override
    public void updateByPrimaryKey(Bookorder bookorder) {
        bookorderMapper.updateByPrimaryKey(bookorder);

    }

}

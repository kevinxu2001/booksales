package com.kevin.booksales.infrastructure.repository;

import com.kevin.booksales.domain.order.Bookorderdetail;
import com.kevin.booksales.domain.order.BookorderdetailRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookorderdetailRepositoryImpl implements BookorderdetailRepository {
    @Override
    public void deleteByPrimaryKey(Integer id) {

    }

    @Override
    public void insert(Bookorderdetail bookorderdetail) {

    }

    @Override
    public int insertSelective(Bookorderdetail bookorderdetail) {
        return 0;
    }

    @Override
    public Bookorderdetail selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public void updateByPrimaryKeySelective(Bookorderdetail bookorderdetail) {

    }

    @Override
    public void updateByPrimaryKey(Bookorderdetail bookorderdetail) {

    }

    @Override
    public List<Bookorderdetail> selectAll() {
        return null;
    }
}

package com.kevin.booksales.domain;

import java.util.List;

public interface Repository<TEntity> {

    void deleteByPrimaryKey(Integer id);

    void insert(TEntity entity);

    int insertSelective(TEntity entity);

    TEntity selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(TEntity entity);

    void updateByPrimaryKey(TEntity entity);

    List<TEntity> selectAll();
}

package com.kevin.booksales.domain;

import java.util.List;

public interface RepositoryStringId<TEntity> {

    void deleteByPrimaryKey(String id);

    void insert(TEntity entity);

    int insertSelective(TEntity entity);

    TEntity selectByPrimaryKey(String id);

    void updateByPrimaryKeySelective(TEntity entity);

    void updateByPrimaryKey(TEntity entity);

}

package com.kevin.booksales.infrastructure.mapper;

import java.util.List;

public interface BaseMapperString <TEntity>{

    int deleteByPrimaryKey(String id);

    int insert(TEntity entity);

    int insertSelective(TEntity entity);

    TEntity selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TEntity entity);

    int updateByPrimaryKey(TEntity entity);

}
package com.kevin.booksales.infrastructure.mapper;

import java.util.List;

public interface BaseMapper<TEntity>{

    int deleteByPrimaryKey(Integer id);

    int insert(TEntity entity);

    int insertSelective(TEntity entity);

    TEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TEntity entity);

    int updateByPrimaryKey(TEntity entity);

    List<TEntity> selectAll();

}

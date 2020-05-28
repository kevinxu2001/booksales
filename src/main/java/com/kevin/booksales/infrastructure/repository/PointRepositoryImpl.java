package com.kevin.booksales.infrastructure.repository;

import com.kevin.booksales.domain.point.Point;
import com.kevin.booksales.domain.point.PointRepository;
import com.kevin.booksales.infrastructure.mapper.PointMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PointRepositoryImpl implements PointRepository {

    @Autowired
    PointMapper pointMapper;

    @Override
    public void deleteByPrimaryKey(String id) {

    }

    @Override
    public void insert(Point point) {
        pointMapper.insert(point);
    }

    @Override
    public int insertSelective(Point point) {
        return 0;
    }

    @Override
    public Point selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public void updateByPrimaryKeySelective(Point point) {

    }

    @Override
    public void updateByPrimaryKey(Point point) {

    }
}

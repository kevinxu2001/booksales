package com.kevin.booksales.infrastructure.mapper;

import com.kevin.booksales.domain.point.Point;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointMapper extends BaseMapper<Point>{
    int selectCountByCustomerid(int customerId);
    List<Point> selectAllByCustomerid(int customerId);
}
package com.kevin.booksales.domain.point;

import com.kevin.booksales.domain.Repository;
import com.kevin.booksales.domain.RepositoryStringId;

import java.util.List;

public interface PointRepository extends RepositoryStringId<Point> {
    int selectCountByCustomerid(int customerId);
    List<Point> selectAllByCustomerid(int customerId);
}

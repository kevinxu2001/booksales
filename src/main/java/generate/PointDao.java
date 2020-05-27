package generate;

import generate.Point;

public interface PointDao {
    int deleteByPrimaryKey(String serialid);

    int insert(Point record);

    int insertSelective(Point record);

    Point selectByPrimaryKey(String serialid);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);
}
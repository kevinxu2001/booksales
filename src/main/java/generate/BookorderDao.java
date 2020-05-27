package generate;

import generate.Bookorder;

public interface BookorderDao {
    int deleteByPrimaryKey(String orderid);

    int insert(Bookorder record);

    int insertSelective(Bookorder record);

    Bookorder selectByPrimaryKey(String orderid);

    int updateByPrimaryKeySelective(Bookorder record);

    int updateByPrimaryKey(Bookorder record);
}
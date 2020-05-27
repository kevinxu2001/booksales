package generate;

import generate.Bookorderdetail;

public interface BookorderdetailDao {
    int deleteByPrimaryKey(String serialid);

    int insert(Bookorderdetail record);

    int insertSelective(Bookorderdetail record);

    Bookorderdetail selectByPrimaryKey(String serialid);

    int updateByPrimaryKeySelective(Bookorderdetail record);

    int updateByPrimaryKey(Bookorderdetail record);
}
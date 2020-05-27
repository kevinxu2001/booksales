package generate;

import generate.Membership;

public interface MembershipDao {
    int deleteByPrimaryKey(Integer levelcode);

    int insert(Membership record);

    int insertSelective(Membership record);

    Membership selectByPrimaryKey(Integer levelcode);

    int updateByPrimaryKeySelective(Membership record);

    int updateByPrimaryKey(Membership record);
}
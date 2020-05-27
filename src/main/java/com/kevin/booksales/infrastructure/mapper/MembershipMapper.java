package com.kevin.booksales.infrastructure.mapper;

import com.kevin.booksales.domain.membership.Membership;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MembershipMapper extends BaseMapper<Membership> {

    Membership selectOneByIdAndLevel(int customerid, int levelcode);

    List<Membership> selectByCustomerId(int customerid);

}
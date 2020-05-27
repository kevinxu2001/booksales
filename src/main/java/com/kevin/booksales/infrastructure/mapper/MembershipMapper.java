package com.kevin.booksales.infrastructure.mapper;

import com.kevin.booksales.domain.membership.Membership;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MembershipMapper extends BaseMapper<Membership> {

}
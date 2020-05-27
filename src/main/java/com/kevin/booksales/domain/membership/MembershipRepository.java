package com.kevin.booksales.domain.membership;

import com.kevin.booksales.domain.Repository;

import java.util.List;

public interface MembershipRepository extends Repository<Membership> {
    Membership selectOneByIdAndLevel(int customerid, int levelcode);
    List<Membership> selectByCustomerId(int customerid);
}

package com.kevin.booksales.domain.membership;

import com.kevin.booksales.domain.Repository;

public interface MembershipRepository extends Repository<Membership> {
    Membership selectOneByIdAndLevel(int customerid, int levelcode);
}

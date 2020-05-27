package com.kevin.booksales.infrastructure.repository;

import com.kevin.booksales.domain.membership.Membership;
import com.kevin.booksales.domain.membership.MembershipRepository;
import com.kevin.booksales.infrastructure.mapper.MembershipMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MembershipRepositoryImpl implements MembershipRepository {

    @Autowired
    MembershipMapper membershipMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {

    }

    @Override
    public void insert(Membership membership) {
        membershipMapper.insert(membership);

    }

    @Override
    public int insertSelective(Membership membership) {
        return 0;
    }

    @Override
    public Membership selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public void updateByPrimaryKeySelective(Membership membership) {

    }

    @Override
    public void updateByPrimaryKey(Membership membership) {
        membershipMapper.updateByPrimaryKey(membership);

    }

    @Override
    public List<Membership> selectAll() {
        return null;
    }

    @Override
    public Membership selectOneByIdAndLevel(int customerid, int levelcode) {
        return membershipMapper.selectOneByIdAndLevel(customerid, levelcode);
    }
}

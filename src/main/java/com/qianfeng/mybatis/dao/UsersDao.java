package com.qianfeng.mybatis.dao;

import com.qianfeng.mybatis.dto.UsersDto;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by admin on 2018/3/19.
 */
@Repository
public class UsersDao implements IUsersDAO {

    @Autowired
    private SqlSession sqlSession;

    @Transactional
    public List<UsersDto> getUserValue() {

        List<UsersDto> usersDtos = sqlSession.selectList("com.qianfeng.mybatis.userDto.users");
        return usersDtos;
    }
}

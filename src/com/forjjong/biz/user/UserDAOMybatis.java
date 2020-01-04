package com.forjjong.biz.user;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

//@Repository
public class UserDAOMybatis {
    @Autowired
    private SqlSessionTemplate mybatis;

    public void insertUser (UserVO vo) throws SQLException {
        System.out.println("===> MyBATIS 기반으로 insertUser() 기능 처리");
        mybatis.insert("UserDAO.insertUser", vo);
        System.out.println("===> MyBATIS 기반으로 insertUser() 기능 처리 완료");
    }

    public void updateUser (UserVO vo) throws Exception {
        System.out.println("===> MyBATIS 기반으로 updateUser() 기능 처리");
        mybatis.update("UserDAO.updateUser", vo);
    }

    public void deleteUser (UserVO vo) throws Exception {
        System.out.println("===> MyBATIS 기반으로 deleteUser() 기능 처리");
        mybatis.insert("UserDAO.deleteUser", vo);
    }

    public UserVO getUser (UserVO vo) throws Exception {
        System.out.println("===> MyBATIS 기반으로 getUser() 기능 처리");
        return (UserVO) mybatis.selectOne("UserDAO.getUser", vo);
    }

    public UserVO loginUser (UserVO vo) throws Exception {
        System.out.println("===> MyBATIS 기반으로 loginUser() 기능 처리");
        return (UserVO) mybatis.selectOne("UserDAO.loginUser", vo);
    }

    public List<UserVO> getUserList (UserVO vo) throws Exception {
        System.out.println("===> MyBATIS 기반으로 getUserList() 기능 처리");
        return (List<UserVO>) (List) mybatis.selectList("UserDAO.getUserList", vo);
    }
}
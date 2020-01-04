package com.forjjong.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@Service("userService")
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAOMybatis userDAO;

    @Override
    public void insertUser(UserVO vo) {
        System.out.println("UserServiceImpl : insertUser 호출");
        System.out.printf("index : %d , id : %s , password : %s, name : %s \n", vo.getUserIdx(), vo.getUserId(), vo.getPassword(), vo.getName());
        try {
            userDAO.insertUser(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(UserVO vo) {
        System.out.println("UserServiceImpl : updateUser 호출");
        try {
            userDAO.updateUser(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(UserVO vo) {
        System.out.println("UserServiceImpl : deleteUser 호출");
        try {
            userDAO.deleteUser(vo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public UserVO getUser(UserVO vo) {
        System.out.println("UserServiceImpl : getUser 호출");
        try {
            return userDAO.getUser(vo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public UserVO loginUser(UserVO vo) {
        System.out.println("UserServiceImpl : loginUser 호출");
        try {
            return userDAO.loginUser(vo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public List<UserVO> getUserList(UserVO vo) {
        System.out.println("UserServiceImpl : getUserList 호출");
        try {
            return userDAO.getUserList(vo);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

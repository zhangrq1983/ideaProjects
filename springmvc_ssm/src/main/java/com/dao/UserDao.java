package com.dao;

import java.util.List;

import com.pojo.User;
 
public interface  UserDao {
    int deleteByPrimaryKey(Integer id);
 
    int insert(User record);
 
    int insertSelective(User record);
 
    List<User> getUserAll();
    
    User selectByPrimaryKey(Integer id);
 
    int updateByPrimaryKeySelective(User record);
 
    int updateByPrimaryKey(User user);
}

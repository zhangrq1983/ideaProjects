package com.service;

import java.util.List;

import com.pojo.User;
 
public interface UserService {
	
	//
    public List<User> getUserAll();

    //根据id查找
    public User getUserById(Integer userid);

    //添加一条数据
    public int insert(User user);

    public int deleteByPrimaryKey(Integer id);

    public int updateByPrimaryKey(User user);
}

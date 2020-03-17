package com.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.dao.UserDao;
import com.pojo.User;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

    /**
     * 因为没有在spring的文件中显式的声明userService实现类，直接通过getBean得到 userService 会找不到
     *  需要显式配置 @Service ("userService")，指定bean的名称
     *  相当与<bean id="userService" class="com.jxust.ssm.service.impl.UserServiceImpl"></bean>
     */
    @Resource
    private UserDao userDao;
 
    public List<User> getUserAll() {   
        return this.userDao.getUserAll();
    }
    
    public User getUserById(Integer userid) {   
        return this.userDao.selectByPrimaryKey(userid);
    }
 
    public int insert(User user) {
        return this.userDao.insert(user);
    }

    public int deleteByPrimaryKey(Integer id){return this.userDao.deleteByPrimaryKey(id);}

    public int updateByPrimaryKey(User user){return this.userDao.updateByPrimaryKey(user);}
}

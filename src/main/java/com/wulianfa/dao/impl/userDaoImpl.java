package com.wulianfa.dao.impl;

import com.wulianfa.dao.userDao;
import com.wulianfa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class userDaoImpl implements userDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    //保存用户
    public void saveUser(User user) {
        hibernateTemplate.saveOrUpdate(user);
    }

    //查找用户
    public User queryUser(User user){
        String hql = "from User where userId = ?";
        List<User> users = (List<User>)hibernateTemplate.find(hql, user.getUserId());
        User u = users.get(0);
        return u;
    }

    //修改用户
    public void updateUser(User user){
        hibernateTemplate.update(user);
    }

    //删除用户
    public void deleteUser(User user){
        hibernateTemplate.delete(user);
    }

}

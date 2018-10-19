package com.wulianfa.service.impl;

import com.wulianfa.dao.userDao;
import com.wulianfa.model.User;
import com.wulianfa.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {

    @Autowired
    private userDao userDao;

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User queryUser(User user) {
        return userDao.queryUser(user);
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
}

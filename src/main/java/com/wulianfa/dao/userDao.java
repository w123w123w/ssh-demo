package com.wulianfa.dao;

import com.wulianfa.model.User;

public interface userDao {

    void saveUser(User user);

    User queryUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}

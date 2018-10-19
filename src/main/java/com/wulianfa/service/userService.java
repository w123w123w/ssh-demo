package com.wulianfa.service;

import com.wulianfa.model.User;

public interface userService {

    void saveUser(User user);

    User queryUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}

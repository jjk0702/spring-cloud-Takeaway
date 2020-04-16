package com.jjk.Provider.Service;

import com.jjk.Provider.dao.UserDao;
import com.jjk.Provider.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserDao userDao;

    public User getUserById(int id){
        return userDao.getById(id);
    }

}

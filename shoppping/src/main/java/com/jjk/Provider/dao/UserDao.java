package com.jjk.Provider.dao;

import com.jjk.Provider.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User getById(int id);

    public int insert(User user);

}


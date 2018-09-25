package com.angularspringdemo.service;

import com.angularspringdemo.entity.User;
import com.angularspringdemo.model.UserModel;
import java.util.List;
import java.util.Map;

/**
 *
 * @author shruti
 */
public interface UserService {

    public Map<String,Object> addUser(UserModel usermodel);
    public List<User> getAll();
}

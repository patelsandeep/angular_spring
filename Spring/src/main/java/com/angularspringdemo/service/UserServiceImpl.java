package com.angularspringdemo.service;

import com.angularspringdemo.entity.User;
import com.angularspringdemo.model.UserModel;
import com.angularspringdemo.dao.UserDao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author shruti
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Map<String, Object> addUser(UserModel usermodel) {
        Map<String, Object> map = new HashMap<>();
        User user = new User();
        user.setName(usermodel.getName());
        user.setEmail(usermodel.getEmail());
        userDao.save(user);

        map.put("user", user);
        map.put("success", "User Added Successfully");
        map.put("status", true);
        return map;
    }

    @Override
    public List<User> getAll() {
        return userDao.findAll();
    }
}

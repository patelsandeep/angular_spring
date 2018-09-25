
package com.angularspringdemo.controller;

import com.angularspringdemo.entity.User;
import com.angularspringdemo.model.UserModel;
import com.angularspringdemo.service.UserService;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author shruti
 */

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {
    @Autowired 
    UserService userService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Map<String,Object> addUser(@RequestBody UserModel usermodel){
        return userService.addUser(usermodel);
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public List<User> getAllUser(){
        return userService.getAll();
    }
}

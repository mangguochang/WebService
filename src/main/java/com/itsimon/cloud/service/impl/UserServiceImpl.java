package com.itsimon.cloud.service.impl;

import com.itsimon.cloud.entity.User;
import com.itsimon.cloud.service.UserService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author simonMeng
 * @version 1.0
 * @date 2019/11/3
 **/
@WebService(targetNamespace = "http://localhost:8080/",endpointInterface = "com.itsimon.cloud.service.UserService")
public class UserServiceImpl implements UserService {
    Map<String,User> userMaps=new HashMap<>();
    public UserServiceImpl(){
        for (int i=1;i<=1000;i++){
            User user=new User();
            user.setId(i+"");
            user.setSex("man");
            user.setAge(28);
            user.setUserName("userName");
            userMaps.put(user.getId(),user);
        }
    }
    @Override
    public String getName(String userId) {
        if(userMaps.containsKey(userId)){
            return userMaps.get(userId).getUserName();
        }
        return null;
    }

    @Override
    public User getUser(String userId) {
        if(userMaps.containsKey(userId)){
            return userMaps.get(userId);
        }
        return null;
    }

    @Override
    public List<User> getAllUser() {
        ArrayList<User> users=new ArrayList<>();
        userMaps.forEach((key,value)->{users.add(value);});
        return users;
    }
}

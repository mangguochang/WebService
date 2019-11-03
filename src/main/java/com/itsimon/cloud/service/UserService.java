package com.itsimon.cloud.service;

import com.itsimon.cloud.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * @author simonMeng
 * @version 1.0
 * @date 2019/11/3
 **/
@WebService
public interface UserService {

    @WebMethod
    public String getName(@WebParam(name = "userId")String userId);
    @WebMethod
    public User getUser(@WebParam(name = "userId")String userId);
    @WebMethod
    public List<User> getAllUser();


}

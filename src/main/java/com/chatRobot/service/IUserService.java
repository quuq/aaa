//package service;
//
//public interface IUserService {
//}
package com.chatRobot.service;

import java.util.List;
import com.chatRobot.model.User;

public interface IUserService {

//    public User selectUser(int userId);
    public void save(User user);
    public boolean update(User user);
    public boolean delete(int id);
    public User findById(int id);
    public List<User> findAll();
}
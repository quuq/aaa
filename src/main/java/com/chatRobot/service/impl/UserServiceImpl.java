//package service.impl;
//
//public class UserServiceImpl {
//}
package com.chatRobot.service.impl;

import com.chatRobot.dao.IUserDao;
import com.chatRobot.model.User;
import com.chatRobot.service.IUserService;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

//@Service("userService")
@Service
@Transactional
public class UserServiceImpl implements IUserService {

//    @Resource
//    private IUserDao userDao;
//
//    public User selectUser(int userId) {
//        return this.userDao.selectUser(userId);
//    }
@Resource
private IUserDao userDao;

    /**
     * 根据  id  删除 数据
     */
    public boolean delete(int id) {
        return userDao.delete(id);
    }
    /**
     * 查询User的全部数据
     */
    public List<User> findAll() {
        List<User> findAllList = userDao.findAll();
        return findAllList;
    }
    /**
     * 根据 id 查询 对应数据
     */
    public User findById(int id) {
        User user = userDao.findById(id);
        return user;
    }
    /**
     * 新增数据
     */
    public void save(User user) {
        userDao.save(user);
    }
    /**
     * 根据 id 修改对应数据
     */
    public boolean update(User user) {
        return userDao.update(user);
    }
}
//package com.chatRobot.dao;
//
//public interface IUserDao {
//}
package com.chatRobot.dao;

import java.util.List;

import com.chatRobot.controller.UserMapperProvider;
import com.chatRobot.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface IUserDao {

//    User selectUser(int id);
//    void save(User user);
//    boolean update(User user);
//    boolean delete(int id);
//    User findById(int id);
//    List<User> findAll(); //具体实现到mapper的xml文件中

    @Insert("insert into t_user(user_name,user_age) values(#{userName},#{age})")
    void save(User user);

    @Update("update t_user set user_name=#{userName},user_age=#{age} where user_id=#{id}")
    boolean update(User user);

    @Delete("delete from t_user where user_id=#{id}")
    boolean delete(@Param("id") Integer id);  //@Param()无法传递对象，如果传参要一个个注释

    //@Select("select user_id id,user_name userName,user_age age from t_user where user_id=#{id}")
    @SelectProvider(type= UserMapperProvider.class , method="SelectById")
    @Results({
            @Result(column="user_id" , property="id" , jdbcType=JdbcType.INTEGER , id = true),
            @Result(column="user_name" , property="userName" , jdbcType=JdbcType.VARCHAR ),
            @Result(column="user_age" , property="age" , jdbcType=JdbcType.VARCHAR )
    })
    User findById(@Param("id") Integer id);

    @Select("select user_id id,user_name userName,user_age age from t_user")
    @Results({
            @Result(column="user_id" , property="id" , jdbcType=JdbcType.INTEGER , id = true),
            @Result(column="user_name" , property="userName" , jdbcType=JdbcType.VARCHAR ),
            @Result(column="user_age" , property="age" , jdbcType=JdbcType.VARCHAR )
    })
    List<User> findAll(); //具体实现到mapper的xml文件中
}
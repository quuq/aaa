package com.chatRobot.controller;

import java.util.Map;

public class UserMapperProvider {
    public String SelectById(Map<String, Object> map){
        StringBuffer s = new StringBuffer();
        s.append("select user_id id,user_name userName,user_age age from t_user ");
        if(!("").equals(map.get("id")) || map.get("id") == null)
            s.append("where user_id=#{id, jdbcType = INTEGER}");
        return s.toString();
    }
}

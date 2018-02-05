package com.linjw.project.web.account.service;

import com.linjw.project.web.account.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    
    public List<Map<String,Object>> findUserInfo() {
        List<Map<String,Object>> list = userMapper.findUserInfo();
        return list;
    }
}
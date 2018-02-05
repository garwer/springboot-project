package com.linjw.project.web.account.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    public List<Map<String,Object>> findUserInfo();
}

package com.linjw.project.web.account.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.linjw.project.web.account.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping({"/home"})
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(value = "/user/{page}/{pageSize}",method = RequestMethod.GET)
    @ResponseBody
    public Object user(@PathVariable Integer page, @PathVariable Integer pageSize) {
        if(page != null &pageSize != null) {
            System.out.println("page:" + page + "---" + "pageSize:" + pageSize);
            PageHelper.startPage(page, pageSize);
        }
        System.out.println(6666688);

        List<Map<String,Object>> list = userService.findUserInfo();
        return new PageInfo(list);
    }
}

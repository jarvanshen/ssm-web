package com.test.web.controller;

import com.test.web.dao.User;
import com.test.web.msg.CommonRsp;
import com.test.web.msg.UserMsg;
import com.test.web.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@Api(tags = "test", description = "test测试")
public class TestController {

    @Autowired
    private TestService service;

    @ApiOperation(value = "test测试GET")
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public Object test() {

        User u = new User();
        u.setPassword("123456");
        u.setUsername("sw");
        return u;
    }

    @ApiOperation(value = "注册用户post")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Object register(@RequestBody UserMsg u) {
        User u2 = new User();
        u2.setUsername(u.getUsername());
        u2.setPassword(u.getPassword());
        u2.setAge(u.getAge());
        service.registerUser(u2);
        CommonRsp rsp = new CommonRsp();
        return rsp;
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)

    public Object test2(HttpServletRequest req) {
        System.out.println(req.getRequestURI());

        User u = new User();
        u.setPassword("123456");
        u.setUsername("sw");
        u.setAge(12);
        req.setAttribute("username", u.getUsername());
        return "index";
    }
}

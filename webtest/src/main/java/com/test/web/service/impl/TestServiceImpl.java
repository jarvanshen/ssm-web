package com.test.web.service.impl;

import com.test.web.dao.IUserDao;
import com.test.web.dao.User;
import com.test.web.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {

    private final static Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
    @Resource
    private IUserDao userDao;

    public void registerUser(User u) {

        logger.debug("registerUser begin");
        logger.error("registerUser begin");
        userDao.insert(u);
        logger.info("registerUser end");
    }
}
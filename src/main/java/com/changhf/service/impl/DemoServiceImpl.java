package com.changhf.service.impl;

import com.changhf.dao.DemoDao;
import com.changhf.entity.User;
import com.changhf.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author <a href="mailto:wb-chf309549@alibaba-inc.com">常华锋</a>
 * @version V1.0.0
 * @since 2018/4/3
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoDao demoDao;

    @Override
    public Map<String, String> findById() {
        return null;
    }

    @Override
    public Map<String, String> listRole() {
        return null;
    }

    @Override
    public void insert(User user) {
        user.setPassword("123321");
        demoDao.insert(user);
    }
}

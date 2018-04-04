package com.changhf.service;

import com.changhf.entity.User;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author <a href="mailto:wb-chf309549@alibaba-inc.com">常华锋</a>
 * @version V1.0.0
 * @since 2018/4/1
 */
@Service
public interface DemoService {
    Map<String, String> findById();

    Map<String, String> listRole();

    void insert(User user);
}

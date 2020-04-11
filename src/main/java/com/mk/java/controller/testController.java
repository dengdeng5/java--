package com.mk.java.controller;

import com.mk.java.controller.Dao.UserDao;
import com.mk.java.controller.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author Administrator
 * 0、配置datasources
 * 1、启动类上加mapperscan注解去扫描sql接口
 * 2、配置sql的xml文件的位置
 * 3、xml文件中的namespacse填写sql接口文件的路径
 */
@Slf4j
@RestController
public class testController {

    @Autowired
    UserDao userDao;

    Logger logger = LoggerFactory.getLogger(testController.class);

    @GetMapping("/queryAllUsers")

    public List<User> queryAllUsers(){
        List<User> users = userDao.queryAllUsers();
        for (User user : users) {
            logger.info("我是{}",user.getUsername());
        }

        return users;

    }
}

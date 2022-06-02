package cn.edu.nchu.bookstore.test;


import cn.edu.nchu.bookstore.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 城市spring框架是否搭建成功
 */
public class TestSpring {

    @Test
    public void run1() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = (AccountService) ac.getBean("accountService");
        System.out.println(accountService.queryAll());
    }


}


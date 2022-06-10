package cn.edu.nchu.bookstore.test;


import cn.edu.nchu.bookstore.entity.BookVO;
import cn.edu.nchu.bookstore.entity.Cart;
import cn.edu.nchu.bookstore.service.AccountService;
import cn.edu.nchu.bookstore.service.BookService;
import cn.edu.nchu.bookstore.service.CartService;
import cn.edu.nchu.bookstore.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Test
    public void run2() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookService accountService = (BookService) ac.getBean("bookService");
        System.out.println(accountService.queryNavigate());
    }


    @Test
    public void run3() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        OrderService orderService = (OrderService) ac.getBean("orderService");
        List<Integer> cartids = new ArrayList<>();
        cartids.add(1);
        cartids.add(12);
        cartids.add(13);
        cartids.add(14);
        orderService.addOrderFromCart(cartids,2);
        System.out.println();
    }

    @Test
    public void run4() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        OrderService orderService = (OrderService) ac.getBean("orderService");


        System.out.println(orderService.queryOrderBind(2,"待发货").size() );
    }

    @Test
    public void run5() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookService bookService = (BookService) ac.getBean("bookService");
        List<BookVO> bookVOS = bookService.queryBookVOByKeys("软件",null,"10","30");
        System.out.println(bookVOS.toString() );
        System.out.println(bookVOS.size());
    }


    @Test
    public void run6() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CartService cartService = (CartService) ac.getBean("cartService");
        Cart cart = new Cart();
        cart.setBookId(1);
        cart.setCartQuantity(1);
        cart.setCustomerId(3);
        cart.setCartAmount(32.0);
        System.out.println(cartService.addToCart(cart));
    }

    @Test
    public void run7() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CartService cartService = (CartService) ac.getBean("cartService");
        List<Integer> cartids = new ArrayList<>();
        cartids.add(15);
        cartids.add(16);
        cartids.add(17);
        cartids.add(18);
        System.out.println(cartService.deleteSelect(cartids));
    }



}


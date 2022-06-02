package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.service.AccountService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("accountController")
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public JsonResult queryAll(){
        System.out.println("wwww");
        return  JsonResult.ok(accountService.queryAll());
    }
}

package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.Account;
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

        return  JsonResult.ok(accountService.queryAll());
    }


    @RequestMapping("/queryByAccountId")
    @ResponseBody
    public JsonResult queryByAccountId(int accountId){
        return  JsonResult.ok(accountService.queryByAccountId(accountId));
    }

    @RequestMapping("/queryAllCustomer")
    @ResponseBody
    public JsonResult queryAllCustomer(){

        return  JsonResult.ok(accountService.queryAllCustomer());
    }

    @RequestMapping("/queryCustomerByCustomerId")
    @ResponseBody
    public JsonResult queryCustomerByCustomerId(int customerId){

        return  JsonResult.ok(accountService.queryCustomerByCustomerId(customerId));
    }

    @RequestMapping("/queryCustomerByAccountId")
    @ResponseBody
    public JsonResult queryCustomerByAccountId(int accountId){

        return  JsonResult.ok(accountService.queryCustomerByAccountId(accountId));
    }


    @RequestMapping("/checkName")
    @ResponseBody
    public JsonResult checkName(String username, int accountId){
        return  JsonResult.ok(accountService.checkName(username,accountId));
    }

}

package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.Return;
import cn.edu.nchu.bookstore.service.ReturnService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("returnController")
@RequestMapping("/return")
public class ReturnController {


    @Autowired
    private ReturnService returnService;

    @RequestMapping("/addReturn")
    @ResponseBody
    public JsonResult addReturn(String content,int orderId){
        Return r = new Return();
        r.setOrderId(orderId);
        r.setReturnReason(content);
        return JsonResult.ok(returnService.addReturn(r));
    }

    @RequestMapping("/queryReturnByOrderId")
    @ResponseBody
    public JsonResult queryReturnByOrderId(int orderId){

        return JsonResult.ok(returnService.queryReturnByOrderId(orderId));
    }

    @RequestMapping("/queryReturnByAccountId")
    @ResponseBody
    public JsonResult queryReturnByAccountId(int accountId){

        return JsonResult.ok(returnService.queryReturnByAccountId(accountId));
    }




}

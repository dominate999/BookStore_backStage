package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.entity.Evaluate;
import cn.edu.nchu.bookstore.service.EvaluateService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("EvaluateController")
@RequestMapping("/evaluate")
public class EvaluateController {


    @Autowired
    private EvaluateService evaluateService;

    @RequestMapping("/addEvaluate")
    @ResponseBody
    public JsonResult addEvaluate(int evaStar,String content,int orderitemId, String username,int bookId,int customerId){
        Evaluate evaluate = new Evaluate();
        evaluate.setEvaStar(evaStar);
        evaluate.setEvaContent(content);
        evaluate.setBookId(bookId);
        evaluate.setUsername(username);
        evaluate.setCustomerId(customerId);
        evaluate.setOrderitemId(orderitemId);
        return JsonResult.ok(evaluateService.addEvaluate(evaluate));
    }



    @RequestMapping("/queryEvaluateByCustomerId")
    @ResponseBody
    public JsonResult queryEvaluateByCustomerId(int customerId){

        return JsonResult.ok(evaluateService.queryEvaluateByCustomerId(customerId));
    }

    @RequestMapping("/queryEvaluateByBookId")
    @ResponseBody
    public JsonResult queryEvaluateByBookId(int bookId){
        return JsonResult.ok(evaluateService.queryEvaluateByBookId(bookId));
    }

}

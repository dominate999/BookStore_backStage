package cn.edu.nchu.bookstore.controller;

import cn.edu.nchu.bookstore.service.BookService;
import cn.edu.nchu.bookstore.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("bookController")
@RequestMapping("/book")
public class BookController {


    @Autowired
    private BookService bookService;


    @RequestMapping("/queryCategory")
    @ResponseBody
    public JsonResult queryCategory(){
        return JsonResult.ok(bookService.queryCategory());
    }

    @RequestMapping("/queryNavigate")
    @ResponseBody
    public JsonResult queryNavigate(){
        return JsonResult.ok(bookService.queryNavigate());
    }


    @RequestMapping("/queryAllBook")
    @ResponseBody
    public JsonResult queryAllBook(){
        return JsonResult.ok(bookService.queryAllBook());
    }


    @RequestMapping("/queryBookById")
    @ResponseBody
    public JsonResult queryBookById(int bookId){
        return JsonResult.ok(bookService.queryBookById(bookId));
    }

    @RequestMapping("/queryBookVOByKw")
    @ResponseBody
    public JsonResult queryBookVOByKw(@RequestParam(name = "kw",defaultValue = "") String kw){
        return JsonResult.ok(bookService.queryBookVOByKw(kw));
    }


    @RequestMapping("/queryBookVOByKeys")
    @ResponseBody
    public JsonResult queryBookVOByKeys(
            @RequestParam(name = "booName",defaultValue = "",required = false) String booName,
            @RequestParam(name = "category",defaultValue = "",required = false) String category,
            @RequestParam(name = "minPrice",defaultValue = "",required = false) String  minPrice,
            @RequestParam(name = "MaxPrice",defaultValue = "" ,required = false)String maxPrice
    ){
        if(booName.equals("")){
            booName = null;
        }
        if(category.equals("")){
            category = null;
        }
        if(minPrice.equals("")){
            minPrice = null;
        }
        if(maxPrice.equals("")){
            maxPrice = null;
        }
        return JsonResult.ok(bookService.queryBookVOByKeys(booName,category,minPrice,maxPrice));
    }


}

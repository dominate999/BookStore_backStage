package cn.edu.nchu.bookstore.service;

import cn.edu.nchu.bookstore.entity.Evaluate;

import java.util.List;

public interface EvaluateService {

     boolean addEvaluate(Evaluate evaluate);

     List<Evaluate> queryEvaluateByBookId(int bookId);

     List<Evaluate> queryEvaluateByCustomerId(int customerId) ;
}

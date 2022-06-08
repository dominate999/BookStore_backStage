package cn.edu.nchu.bookstore.service.impl;

import cn.edu.nchu.bookstore.dao.BookVODao;
import cn.edu.nchu.bookstore.dao.CategoryDao;
import cn.edu.nchu.bookstore.dao.SubCategroyDao;
import cn.edu.nchu.bookstore.dao.SubcategoryVODao;
import cn.edu.nchu.bookstore.entity.*;
import cn.edu.nchu.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {


    @Autowired
    private SubcategoryVODao subcategoryVODao;
    @Autowired
    private CategoryDao categoryDao;
    @Autowired
    private SubCategroyDao subCategroyDao;
    @Autowired
    private BookVODao bookVODao;


    @Override
    public List<SubcategoryVO> queryCategory() {
        return subcategoryVODao.queryAllCate();
    }

    @Override
   public List<CategoryBind> queryNavigate(){
      List<Category> categories = categoryDao.queryCategory();
      List<CategoryBind> categoryBinds = new ArrayList<>();
      CategoryBind categoryBind ;
      for (int i = 0; i < categories.size(); i++) {
          categoryBind  = new CategoryBind();
          categoryBind.setId(categories.get(i).getId());
          categoryBind.setCategoryName(categories.get(i).getCategoryName());
          List<Subcategory> subcategories = subCategroyDao.querySubCategroyBySuperId(categories.get(i).getId());
          categoryBind.setSubcategories(subcategories);
          categoryBinds.add(categoryBind);
      }
      return categoryBinds;
    }

    @Override
    public List<BookVO> queryAllBook() {
        return bookVODao.queryAllBook();
    }

    @Override
    public BookVO queryBookById(int bookId){
        return bookVODao.queryBookById(bookId);
    }

    @Override
    public  List<BookVO> queryBookVOByKw(String kw){
        return bookVODao.queryBookVOByKw(kw);
    }

    @Override
    public List<BookVO> queryBookVOByKeys(String booName, String category, String minPrice, String maxPrice) {
        return bookVODao.queryBookVOByKeys(booName, category, minPrice, maxPrice);
    }
}

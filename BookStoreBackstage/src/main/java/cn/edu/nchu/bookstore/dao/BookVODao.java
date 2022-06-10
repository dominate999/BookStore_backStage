package cn.edu.nchu.bookstore.dao;

import cn.edu.nchu.bookstore.entity.BookVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookVODao{

    @Select("select * from book_view")
    List<BookVO> queryAllBook();


    @Select("select * from book_view ")
    List<BookVO> queryBookByKeyword();


    @Select("select * from book_view where id = #{bookId}")
    BookVO queryBookById(int bookId);

    @Select("select * from book_view order by saleAmount desc")
    List<BookVO> queryAllBookOrderBySale();



    /**
     *
     * @param kw
     * @return
     */
    @Select("select * from `book_view` where 1=1\n" +
            "and bookName LIKE CONCAT('%',#{kw},'%')\n" +
            "or bookISBN LIKE CONCAT('%',#{kw},'%')\n" +
            "or publisher LIKE CONCAT('%',#{kw},'%')\n" +
            "or bookAuthor LIKE CONCAT('%',#{kw},'%')\n" +
            "or bookBlurb LIKE CONCAT('%',#{kw},'%')\n" +
            "or categoryName LIKE CONCAT('%',#{kw},'%')\n" +
            "or subcategoryName LIKE CONCAT('%',#{kw},'%')")
    List<BookVO> queryBookVOByKw(String kw);


    /**
     *
     * @param booName
     * @param category
     * @param minPrice
     * @param maxPrice
     * @return
     */
    @Select("<script>" +
            "select * from `book_view`" +
            "<where>"+
            "<if test='bookName != null'>and bookName LIKE CONCAT('%',#{bookName},'%')</if> "+
            " <if test='category != null'>and categoryName LIKE CONCAT('%',#{category},'%') or subcategoryName LIKE CONCAT('%',#{category},'%')</if> "+
            " <if test='minPrice != null'>and bookPrice &gt;= #{minPrice}</if>" +
            "<if test='maxPrice != null'>and bookPrice &lt;= #{maxPrice}</if>"+
            "</where>"+
            "</script>")
    List<BookVO> queryBookVOByKeys(@Param("bookName") String booName,@Param("category") String category, @Param("minPrice")String minPrice,@Param("maxPrice")String maxPrice);


}

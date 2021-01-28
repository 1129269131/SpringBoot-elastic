package com.tjh.elastic;

import com.tjh.elastic.bean.Book;
import com.tjh.elastic.respository.BookReponsitory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot03ElasticApplicationTests {

    @Autowired
    BookReponsitory bookReponsitory;

    @Test
    public void test01() {
        Book book = new Book();
        book.setId(1);
        book.setBookName("西游记");
        book.setAuthor("吴承恩");
        bookReponsitory.index(book);
    }

    @Test
    public void test02() {
        for (Book book : bookReponsitory.findByBookNameLike("游")) {
            System.out.println(book);
        }
    }

}

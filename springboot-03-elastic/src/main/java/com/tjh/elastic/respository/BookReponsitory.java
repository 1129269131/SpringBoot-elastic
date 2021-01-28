package com.tjh.elastic.respository;

import com.tjh.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface BookReponsitory extends ElasticsearchRepository<Book, Integer> {
    //自定义方法
    public List<Book> findByBookNameLike(String bookName);
}

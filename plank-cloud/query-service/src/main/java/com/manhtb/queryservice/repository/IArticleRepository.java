package com.manhtb.queryservice.repository;

import com.manhtb.queryservice.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
@Repository
public interface IArticleRepository extends ElasticsearchRepository<Article, String> {
    List<Article> findByTitle(String q);
    List<Article> findByContent(String q);
    List<Article> findByNewsSubHeader(String q);
    List<Article> findByNewsPostDate(String q);
    List<Article> findByTitleAndContent(String titleTerm, String contentTerm);
    List<Article> findByTitleOrContent(String titleTerm, String contentTerm);
}

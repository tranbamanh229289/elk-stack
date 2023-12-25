package com.manhtb.queryservice.service;

import com.manhtb.queryservice.model.Article;
import org.springframework.data.elasticsearch.core.SearchHits;

import java.util.List;

public interface IQueryService {
    List<Article> matchFieldTitle(String q);
    List<Article> matchFieldContent(String q);
    List<Article> matchFieldNewsSubHeader(String q);
    List<Article> matchFieldNewsPostDate(String q);
    List<Article> queryTitleAndContent(String titleTerm, String contentTerm);
    List<Article> queryTitleOrContent(String titleTerm, String contentTerm);
}

package com.manhtb.queryservice.service.impl;

import com.manhtb.queryservice.dto.ArticleDto;
import com.manhtb.queryservice.model.Article;
import com.manhtb.queryservice.repository.IArticleRepository;
import com.manhtb.queryservice.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.client.elc.NativeQuery;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.data.elasticsearch.core.query.StringQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryService implements IQueryService {
    @Autowired
    private IArticleRepository queryRepository;

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Override
    public List<Article> matchFieldTitle(String q) {
//        Query query = NativeQuery.builder().withQuery(q -> q.match(m-> m.field("title").query(title))).build();
        return queryRepository.findByTitle(q);
    }

    @Override
    public List<Article> matchFieldContent(String q) {
        return queryRepository.findByContent(q);
    }

    @Override
    public List<Article> matchFieldNewsSubHeader(String q) {
        return queryRepository.findByNewsSubHeader(q);
    }

    @Override
    public List<Article> matchFieldNewsPostDate(String q) {
        return queryRepository.findByNewsPostDate(q);
    }

    @Override
    public List<Article> queryTitleAndContent(String titleTerm, String contentTerm) {
        return queryRepository.findByTitleAndContent(titleTerm, contentTerm);
    }

    @Override
    public List<Article> queryTitleOrContent(String titleTerm, String contentTerm) {
        return queryRepository.findByTitleOrContent(titleTerm, contentTerm);
    }


}

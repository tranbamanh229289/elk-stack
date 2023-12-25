package com.manhtb.queryservice.service.impl;

import com.manhtb.queryservice.dto.ArticleDto;
import com.manhtb.queryservice.model.Article;
import com.manhtb.queryservice.repository.IArticleRepository;
import com.manhtb.queryservice.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Service;

@Service
public class IndexService implements IIndexService {
    @Autowired
    private IArticleRepository articleRepository;

    @Autowired
    private ElasticsearchOperations elasticsearchOperations;

    @Override
    public ArticleDto createArticle(ArticleDto article) {
        Article newArticle = new Article(article.getId(), article.getTitle(), article.getContent(), article.getNewSubHeader(), article.getNewPostDate());
        articleRepository.save(newArticle);
        return article;
    }


}

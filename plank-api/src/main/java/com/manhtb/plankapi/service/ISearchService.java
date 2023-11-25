package com.manhtb.plankapi.service;

import com.manhtb.plankapi.model.Article;

import java.util.List;

public interface ISearchService {
    public List<Article> search(String keyword);
}

package com.manhtb.plankapi.service.impl;

import com.manhtb.plankapi.model.Article;
import com.manhtb.plankapi.service.ISearchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService implements ISearchService {
    public List<Article> search(String keyword) {
        return null;
    }
}

package com.manhtb.plankapi.controller;

import com.manhtb.plankapi.model.Article;
import com.manhtb.plankapi.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class SearchController {
    @Autowired
    private ISearchService searchService;
    @PostMapping(value = "/search")
    public ResponseEntity<List<Article>> search(String keyword) {
        return ResponseEntity.status(HttpStatus.OK).body(searchService.search(keyword));
    }
}

package com.manhtb.queryservice.controller;

import co.elastic.clients.elasticsearch.nodes.Http;
import com.manhtb.queryservice.dto.ArticleDto;
import com.manhtb.queryservice.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/index")
public class IndexController {
    @Autowired
    private IIndexService indexService;

    @PostMapping(value = "/")
    public ResponseEntity<ArticleDto> createArticle(ArticleDto articleDto) {
        return ResponseEntity.status(HttpStatus.OK).body(indexService.createArticle(articleDto));
    }
}

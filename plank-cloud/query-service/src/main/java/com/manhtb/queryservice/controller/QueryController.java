package com.manhtb.queryservice.controller;

import com.manhtb.queryservice.dto.ArticleDto;
import com.manhtb.queryservice.model.Article;
import com.manhtb.queryservice.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/query")
public class QueryController {
    @Autowired
    private IQueryService queryService;
    @GetMapping(value = "/field/title")
    public ResponseEntity<List<Article>> matchFieldTitle(@RequestParam String q) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.matchFieldTitle(q));
    }

    @GetMapping(value = "/field/content")
    public ResponseEntity<List<Article>> matchFieldContent(@RequestParam String q) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.matchFieldContent(q));
    }

    @GetMapping(value = "/field/newsSubHeader")
    public ResponseEntity<List<Article>> matchFieldNewsSubHeader(@RequestParam String q) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.matchFieldNewsSubHeader(q));
    }

    @GetMapping(value = "/field/newsPostDate")
    public ResponseEntity<List<Article>> matchFieldNewsPostDate(@RequestParam String q) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.matchFieldNewsPostDate(q));
    }

    @GetMapping(value = "/bool/and")
    public ResponseEntity<List<Article>> queryTitleAndContent(@RequestParam String titleTerm, String contentTerm) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.queryTitleAndContent(titleTerm, contentTerm));
    }

    @GetMapping(value = "/bool/or")
    public ResponseEntity<List<Article>> queryTitleOrContent(@RequestParam String titleTerm, String contentTerm) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.queryTitleOrContent(titleTerm, contentTerm));
    }

}

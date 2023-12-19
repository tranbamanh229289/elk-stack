package com.manhtb.queryservice.controller;

import com.manhtb.queryservice.dto.ArticleDto;
import com.manhtb.queryservice.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/query")
public class QueryController {
    @Autowired
    private IQueryService queryService;
    @GetMapping(value = "/")
    public ResponseEntity<List<ArticleDto>> query(String s) {
        return ResponseEntity.status(HttpStatus.OK).body(queryService.query(s));
    }
}

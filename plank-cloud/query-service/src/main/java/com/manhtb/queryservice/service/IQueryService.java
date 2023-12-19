package com.manhtb.queryservice.service;

import com.manhtb.queryservice.dto.ArticleDto;

import java.util.List;

public interface IQueryService {
    public List<ArticleDto> query(String s);
}

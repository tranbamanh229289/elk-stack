package com.manhtb.queryservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(indexName="article")
public class Article {
    @Id
    private String id;
    private String title;
    private String author;
    private String content;
    private String datetime;
}

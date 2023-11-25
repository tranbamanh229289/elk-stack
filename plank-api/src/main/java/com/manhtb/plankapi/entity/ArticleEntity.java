package com.manhtb.plankapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "article")
@Getter
@Setter
@AllArgsConstructor
public class ArticleEntity {
    @Id
    private String id;
    private String title;
    private String author;
    private String content;
    private String timestamp;
}

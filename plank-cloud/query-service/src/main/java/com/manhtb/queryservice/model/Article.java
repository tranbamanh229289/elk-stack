package com.manhtb.queryservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Getter
@Setter
@AllArgsConstructor
@Document(indexName="article")
public class Article {
    @Id
    private String id;
    private String title;
    private String content;
    @Field(name = "news_sub_header")
    private String newsSubHeader;
    @Field(name = "news_post_date")
    private String newsPostDate;
}

package com.manhtb.plankapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Article {
    private String id;
    private String title;
    private String author;
    private String content;
    private String timestamp;
}

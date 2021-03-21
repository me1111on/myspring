package com.study.springaws.springboot.web.dto;

import com.study.springaws.springboot.domain.posts.Posts;

public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;

    public PostsListResponseDto(Posts entitiy){
        this.id = entitiy.getId();
        this.title = entitiy.getTitle();
        this.author = entitiy.getAuthor();
    }

}

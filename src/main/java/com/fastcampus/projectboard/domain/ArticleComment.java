package com.fastcampus.projectboard.domain;

import java.time.LocalDateTime;

// 댓글
public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime createdAt;
    private String createBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}

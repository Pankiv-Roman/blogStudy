package com.example.blog.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import java.util.List;


@Getter
@Setter
@Entity

public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Generated(GenerationTime.INSERT)
    private Long id;
    private String title;
    private String content;

    public Post() {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }
}




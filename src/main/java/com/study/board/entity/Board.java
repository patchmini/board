package com.study.board.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
public class Board {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="title", length = 200)
    private String title;

    @Column(name="content", columnDefinition = "TEXT")
    private String content;

    private String filename;

    private String filepath;
}

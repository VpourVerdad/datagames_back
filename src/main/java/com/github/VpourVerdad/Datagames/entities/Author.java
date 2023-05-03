package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinColumn
    private Set<BoardGame> boardgame;
}

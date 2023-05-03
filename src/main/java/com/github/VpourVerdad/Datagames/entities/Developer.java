package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "developer")
    private Set<VideoGame> videogame;

}

package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.*;

import java.util.Set;


@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_publisher")
    private Publisher publisher;

    @ManyToMany
    @JoinColumn(name = "id_genre")
    private Set<Genre> genre;

    @Column
    private int year;

    @Column
    private boolean isFavorite;


    public Game(Long id, String name, Publisher publisher, Set<Genre> genre, int year, boolean isFavorite) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.genre = genre;
        this.year = year;
        this.isFavorite = isFavorite;
    }

    public Game() {

    }

    public Game(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
        this.name = name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Set<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Set<Genre> genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public Long getId() {
        return id;
    }
}

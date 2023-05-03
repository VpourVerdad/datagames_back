package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "boardgame")
public class BoardGame extends Game{

    @Column
    private int minPlayers;

    @Column
    private int maxPlayers;

    @ManyToMany
    @JoinColumn(name = "id_author")
    private Set<Author> author;

    @Column
    private int duration;

    public BoardGame(Long id, String name, Publisher publisher, Set<Genre> genre, int year, boolean isFavorite, int minPlayers, int maxPlayers, Set<Author> author, int duration) {
        super(id, name, publisher, genre, year, isFavorite);
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.author = author;
        this.duration = duration;
    }

    public BoardGame() {

    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

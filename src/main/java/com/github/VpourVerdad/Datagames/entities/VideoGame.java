package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "videogame")
public class VideoGame extends Game{

    @Column
    private String platform;

    @ManyToOne
    @JoinColumn(name = "id_developer")
    private Developer developer;

    public VideoGame(Long id, String name, Publisher publisher, Set<Genre> genre, int year, boolean isFavorite, String platform, Developer developer) {
        super(id, name, publisher, genre, year, isFavorite);
        this.platform = platform;
        this.developer = developer;
    }

    public VideoGame() {

    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }
}

package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "publishers")
public class Publisher {

    public enum PublisherType {
        VIDEO_GAME_PUBLISHER,
        BOARD_GAME_PUBLISHER,
        ROLE_PLAYING_GAME_PUBLISHER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    private PublisherType publisherType;

    @OneToMany(mappedBy = "publisher")
    private Set<Game> game;

    public Publisher(Long id, String name, PublisherType publisherType, Set<Game> game) {
        this.id = id;
        this.name = name;
        this.publisherType = publisherType;
        this.game = game;
    }

    public Publisher() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublisherType getPublisherType() {
        return publisherType;
    }

    public void setPublisherType(PublisherType publisherType) {
        this.publisherType = publisherType;
    }

    public Set<Game> getGame() {
        return game;
    }

    public void setGame(Set<Game> game) {
        this.game = game;
    }
}

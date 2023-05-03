package com.github.VpourVerdad.Datagames.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Set;

@Entity
@Table(name = "roleplayinggame")
public class RolePlayingGame extends Game {

    private String setting;

    private String system;

    public RolePlayingGame(Long id, String name, Publisher publisher, Set<Genre> genre, int year, boolean isFavorite, String setting, String system) {
        super(id, name, publisher, genre, year, isFavorite);
        this.setting = setting;
        this.system = system;
    }

    public RolePlayingGame() {

    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}

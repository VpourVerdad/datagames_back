package com.github.VpourVerdad.Datagames.Controler;

import com.github.VpourVerdad.Datagames.entities.Game;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @GetMapping("/all")
    public ResponseEntity<List<Game>> getAllGames() {
        return null;
    }
}

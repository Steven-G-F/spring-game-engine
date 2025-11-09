package com.example.gameengine.controller;

import com.example.gameengine.engine.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    private final Player player;

    public PlayerController(Player player) {
        this.player = player;
    }

    @GetMapping("/player/action")
    public String playerAction() {
        player.performAction();
        return player.getName() + " performed an action!";
    }
}

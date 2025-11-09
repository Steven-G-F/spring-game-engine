package com.example.gameengine.engine;

import org.springframework.stereotype.Component;

@Component
public class HumanPlayer implements Player{

    private final String name = "Hero";
    private final Computer ai;

    public HumanPlayer(Computer ai) {
        this.ai = ai;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void performAction() {
        System.out.println(name + " takes a confident step forward.");
        ai.reactToPlayerAction("step forward");
    }

}

package com.example.gameengine.engine;

import org.springframework.stereotype.Component;

@Component
public class ComputerPlayer implements Computer{
    @Override
    public void reactToPlayerAction(String action) {
        if (action.equalsIgnoreCase("step forward")) {
            System.out.println("AI takes a cautious step back.");
        } else {
            System.out.println("AI observes silently.");
        }
    }
}

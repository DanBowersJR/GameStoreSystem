package com.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Game> availableGames = new ArrayList<>();

    public void addGameToStore(Game game) {
        availableGames.add(game);
    }

    public List<Game> getAvailableGames() {
        return availableGames;
    }
}

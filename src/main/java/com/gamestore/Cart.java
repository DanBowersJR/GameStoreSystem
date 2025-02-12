package com.gamestore;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
    }

    public void removeGame(Game game) {
        games.remove(game);
    }

    public double getTotalPrice() {
        return games.stream().mapToDouble(Game::getPrice).sum();
    }
}

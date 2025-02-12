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

    public List<Game> getGamesInCart() {
        return games;
    }

    public double calculateTotal() {
        return games.stream().mapToDouble(Game::getPrice).sum();
    }

    public void clearCart() {
        games.clear();
    }

    public boolean isEmpty() {
        return games.isEmpty();
    }
}

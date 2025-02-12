package com.gamestore;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();
        PurchaseManager purchaseManager = new PurchaseManager();

        // Full list of Nintendo games
        List<Game> gameList = new ArrayList<>();
        gameList.add(new Game("The Legend of Zelda: Breath of the Wild", 59.99));
        gameList.add(new Game("Super Mario Odyssey", 49.99));
        gameList.add(new Game("Mario Kart 8 Deluxe", 39.99));
        gameList.add(new Game("Super Smash Bros. Ultimate", 59.99));
        gameList.add(new Game("Pokémon Scarlet & Violet", 59.99));
        gameList.add(new Game("Animal Crossing: New Horizons", 49.99));
        gameList.add(new Game("Luigi's Mansion 3", 39.99));
        gameList.add(new Game("Splatoon 3", 59.99));
        gameList.add(new Game("Metroid Dread", 49.99));
        gameList.add(new Game("Fire Emblem: Three Houses", 39.99));
        gameList.add(new Game("Kirby and the Forgotten Land", 49.99));
        gameList.add(new Game("Xenoblade Chronicles 3", 59.99));
        gameList.add(new Game("Donkey Kong Country: Tropical Freeze", 39.99));
        gameList.add(new Game("Pikmin 4", 49.99));
        gameList.add(new Game("Bayonetta 3", 59.99));
        gameList.add(new Game("Yoshi’s Crafted World", 39.99));

        // Add all games to the store
        for (Game game : gameList) {
            store.addGameToStore(game);
        }

        // Display available games
        System.out.println("Welcome to the Nintendo Game Store!");
        System.out.println("Available Games:");
        for (Game game : store.getAvailableGames()) {
            System.out.println("- " + game.getTitle() + " ($" + game.getPrice() + ")");
        }

        // Simulate adding some games to the cart
        System.out.println("\nAdding games to cart...");
        cart.addGame(gameList.get(0)); // First game
        cart.addGame(gameList.get(3)); // Fourth game
        cart.addGame(gameList.get(6)); // Seventh game

        // Show cart total
        System.out.println("Total Price: $" + cart.getTotalPrice());

        // Process purchase
        System.out.println("\nProcessing purchase...");
        purchaseManager.purchase(cart);
    }
}

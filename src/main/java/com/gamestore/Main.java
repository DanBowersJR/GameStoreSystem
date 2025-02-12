package com.gamestore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        Cart cart = new Cart();
        PurchaseManager purchaseManager = new PurchaseManager();

        // Full List of Nintendo games
        List<Game> gameList = Arrays.asList(
                new Game("The Legend of Zelda: Breath of the Wild", 59.99),
                new Game("Super Mario Odyssey", 49.99),
                new Game("Mario Kart 8 Deluxe", 39.99),
                new Game("Super Smash Bros. Ultimate", 59.99),
                new Game("Pokémon Scarlet & Violet", 59.99),
                new Game("Animal Crossing: New Horizons", 49.99),
                new Game("Luigi's Mansion 3", 39.99),
                new Game("Splatoon 3", 59.99),
                new Game("Metroid Dread", 49.99),
                new Game("Fire Emblem: Three Houses", 39.99),
                new Game("Kirby and the Forgotten Land", 49.99),
                new Game("Xenoblade Chronicles 3", 59.99),
                new Game("Donkey Kong Country: Tropical Freeze", 39.99),
                new Game("Pikmin 4", 49.99),
                new Game("Bayonetta 3", 59.99),
                new Game("Yoshi's Crafted World", 39.99)
        );

        // Add all games to the store
        for (Game game : gameList) {
            store.addGameToStore(game);
        }

        // CLI Menu
        while (true) {
            System.out.println("\nWelcome to the Nintendo Game Store!");
            System.out.println("1. View available games");
            System.out.println("2. Add game to cart");
            System.out.println("3. View cart");
            System.out.println("4. Remove game from cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("\nAvailable Games:");
                    int index = 1;
                    for (Game game : store.getAvailableGames()) {
                        System.out.println(index++ + ". " + game.getTitle() + " ($" + game.getPrice() + ")");
                    }
                    break;

                case 2:
                    System.out.println("Enter the number of the game you want to add to cart:");
                    try {
                        int gameIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (gameIndex >= 0 && gameIndex < store.getAvailableGames().size()) {
                            cart.addGame(store.getAvailableGames().get(gameIndex));
                            System.out.println("Game added to cart!");
                        } else {
                            System.out.println("Invalid selection.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                    break;

                case 3:
                    System.out.println("\nYour Cart:");
                    if (cart.getGamesInCart().isEmpty()) {
                        System.out.println("Your cart is empty.");
                    } else {
                        int cartIndex = 1;
                        for (Game game : cart.getGamesInCart()) {
                            System.out.println(cartIndex++ + ". " + game.getTitle() + " ($" + game.getPrice() + ")");
                        }
                        System.out.println("Total Price: $" + cart.calculateTotal());
                    }
                    break;

                case 4:
                    System.out.println("Enter the number of the game you want to remove from the cart:");
                    try {
                        int removeIndex = Integer.parseInt(scanner.nextLine()) - 1;
                        if (removeIndex >= 0 && removeIndex < cart.getGamesInCart().size()) {
                            cart.removeGame(cart.getGamesInCart().get(removeIndex));
                            System.out.println("Game removed from cart!");
                        } else {
                            System.out.println("Invalid selection.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                    break;

                case 5:
                    double total = cart.calculateTotal();
                    if (total > 0) {
                        purchaseManager.processPurchase(cart);
                    } else {
                        System.out.println("Cannot checkout. Cart is empty!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting store. Thank you for visiting!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}

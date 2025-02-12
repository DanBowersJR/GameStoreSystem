package com.gamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class CartTest {

    @Test
    void testAddGame() {
        Cart cart = new Cart();
        Game game = new Game("Super Mario Odyssey", 49.99);
        cart.addGame(game);
        assertEquals(1, cart.getGamesInCart().size());
        assertEquals(49.99, cart.calculateTotal());
    }

    @Test
    void testRemoveGame() {
        Cart cart = new Cart();
        Game game = new Game("The Legend of Zelda: Breath of the Wild", 59.99);
        cart.addGame(game);
        cart.removeGame(game);
        assertEquals(0, cart.getGamesInCart().size());
        assertEquals(0.0, cart.calculateTotal());
    }

    @Test
    void testCartTotalCalculation() {
        Cart cart = new Cart();
        cart.addGame(new Game("Super Mario Odyssey", 49.99));
        cart.addGame(new Game("Mario Kart 8 Deluxe", 39.99));
        assertEquals(89.98, cart.calculateTotal());
    }
}

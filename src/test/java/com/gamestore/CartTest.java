package com.gamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void testAddGame() {
        Cart cart = new Cart();
        Game game = new Game("Super Mario Odyssey", 49.99);
        cart.addGame(game);
        assertEquals(49.99, cart.getTotalPrice());
    }

    @Test
    void testRemoveGame() {
        Cart cart = new Cart();
        Game game = new Game("The Legend of Zelda: Breath of the Wild", 59.99);
        cart.addGame(game);
        cart.removeGame(game);
        assertEquals(0, cart.getTotalPrice());
    }
}

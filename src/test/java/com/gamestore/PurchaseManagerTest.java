package com.gamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseManagerTest {

    @Test
    void testSuccessfulPurchase() {
        Cart cart = new Cart();
        cart.addGame(new Game("Super Mario Odyssey", 49.99));
        cart.addGame(new Game("The Legend of Zelda: Breath of the Wild", 59.99));

        PurchaseManager purchaseManager = new PurchaseManager();
        purchaseManager.processPurchase(cart); // Updated method name

        assertTrue(cart.isEmpty()); // Ensure cart is emptied after purchase
    }

    @Test
    void testFailedPurchase() {
        Cart cart = new Cart(); // Empty cart

        PurchaseManager purchaseManager = new PurchaseManager();
        purchaseManager.processPurchase(cart); // Updated method name

        assertTrue(cart.isEmpty()); // Cart should still be empty
    }
}

package com.gamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PurchaseManagerTest {

    @Test
    void testSuccessfulPurchase() {
        Cart cart = new Cart();
        PurchaseManager purchaseManager = new PurchaseManager();

        cart.addGame(new Game("Super Mario Odyssey", 49.99));
        cart.addGame(new Game("Zelda: Breath of the Wild", 59.99));

        assertTrue(purchaseManager.purchase(cart)); // Should return true for a successful purchase
    }

    @Test
    void testFailedPurchase() {
        Cart cart = new Cart();
        PurchaseManager purchaseManager = new PurchaseManager();

        assertFalse(purchaseManager.purchase(cart)); // Should return false when cart is empty
    }
}

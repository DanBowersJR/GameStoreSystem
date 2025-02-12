package com.gamestore;

public class PurchaseManager {
    public void processPurchase(Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Purchase failed! Your cart is empty.");
        } else {
            System.out.println("Purchase successful! Total: $" + cart.calculateTotal());
            cart.clearCart();  // Clears cart after purchase
        }
    }
}

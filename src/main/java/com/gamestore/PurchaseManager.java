package com.gamestore;

public class PurchaseManager {
    public boolean purchase(Cart cart) {
        if (cart.getTotalPrice() > 0) {
            System.out.println("Purchase successful! Total: $" + cart.getTotalPrice());
            return true;
        }
        System.out.println("Purchase failed: Cart is empty!");
        return false;
    }
}

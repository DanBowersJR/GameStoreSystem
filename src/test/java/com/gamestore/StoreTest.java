package com.gamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StoreTest {

    @Test
    void testAddGameToStore() {
        Store store = new Store();
        Game game = new Game("Metroid Prime Remastered", 39.99);
        store.addGameToStore(game);
        List<Game> availableGames = store.getAvailableGames();
        assertTrue(availableGames.contains(game));
    }

    @Test
    void testGetAvailableGames() {
        Store store = new Store();
        Game game1 = new Game("Donkey Kong Country", 29.99);
        Game game2 = new Game("F-Zero GX", 34.99);
        store.addGameToStore(game1);
        store.addGameToStore(game2);
        assertEquals(2, store.getAvailableGames().size());
    }
}

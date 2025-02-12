package com.gamestore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class StoreTest {

    @Test
    void testAddGameToStore() {
        Store store = new Store();
        Game game = new Game("Metroid Dread", 49.99);
        store.addGameToStore(game);
        List<Game> availableGames = store.getAvailableGames();
        assertTrue(availableGames.contains(game));
    }
}

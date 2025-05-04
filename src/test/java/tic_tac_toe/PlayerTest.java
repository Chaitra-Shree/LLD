package tic_tac_toe;

import org.junit.Test;
import org.junit.Assert;

public class PlayerTest {

    @Test
    public void testPlayer() {
        PlayerSymbol playerSymbol = PlayerSymbol.X;
        Player player1 = new Player(playerSymbol);
        Assert.assertEquals(PlayerSymbol.X, player1.getPlayerSymbol());

        PlayerSymbol playerSymbol2 = PlayerSymbol.O;
        Player player2 = new Player(playerSymbol2);
        Assert.assertEquals(PlayerSymbol.O, player2.getPlayerSymbol());
    }
}

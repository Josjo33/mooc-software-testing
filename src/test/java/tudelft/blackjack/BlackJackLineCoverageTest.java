package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {

    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(21, 21);
        Assertions.assertEquals(21, result);
    }

    @Test
    public void Losdospasaalgo() {
        int result = new BlackJack().play(20, 30);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(-10, -10);
        Assertions.assertEquals(-10, result);
    }

    @Test
    public void DeberiEmpatar() {
        int result = new BlackJack().play(-10, -10);
        Assertions.assertEquals(-10, result);
    }
}

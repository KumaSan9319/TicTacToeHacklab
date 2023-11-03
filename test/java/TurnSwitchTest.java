import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TurnSwitchTest {

    @Test
    void testIfPlayersExistAndCanPlay() {
        GameController gameController = new GameController();

        // Remembering first player and setting turn to the next player
        String previousPlayer = gameController.getCurrentPlayer();
        gameController.turnToNextPlayer();

        // Test if turnToNextPlayer works by comparing names of previous and current player
        Assertions.assertNotEquals(previousPlayer, gameController.getCurrentPlayer());
    }



}

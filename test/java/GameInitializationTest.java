import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameInitializationTest {

    @Test
    void testIfGameAndPlayersCreated() {
        // Create game controller which in turn creates game instance and players
        GameController gameController = new GameController();

        // Test whether game object is actually instance of game and if players array is not empty
        Assertions.assertInstanceOf(Game.class, gameController.getGame());
        Assertions.assertNotNull(gameController.getGame().getPlayers());
    }

}

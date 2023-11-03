import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayFieldTest {

    @Test
    public void testIfSquaresAreDrawn() {
        GameController gameController = new GameController();

        String expectedPlayField = """
                -------------
                |   |   |   |
                |---|---|---|
                |   |   |   |
                |---|---|---|
                |   |   |   |
                -------------""";

        // printing play field for personal preference
//        System.out.println(gameController.getPlayField());

        // testing if getPlayField is not empty
        Assertions.assertEquals(expectedPlayField, gameController.getPlayField());
    }

}

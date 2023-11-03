public class Game {

    private int playerTurnIndex = 0;
    private Player[] players;
    private String[] squares = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public String[] getSquares() {
        return squares;
    }

    public String getPlayField() {
        String playField = """
                -------------
                | %s | %s | %s |
                |---|---|---|
                | %s | %s | %s |
                |---|---|---|
                | %s | %s | %s |
                -------------""".formatted (getSquares()[0], getSquares()[1], getSquares()[2],
                                            getSquares()[3], getSquares()[4], getSquares()[5],
                                            getSquares()[6], getSquares()[7], getSquares()[8]);

        return playField;
    }

    public String getCurrentPlayer() {
        return players[playerTurnIndex].getName();
    }

    public boolean isSquare() {
        return true;
    }

    public boolean isSquareEmpty() {
        return true;
    }

    public void placeMarker(String square){

    }

    public boolean isGameOver() {
        return true;
    }

    public boolean hasPlayerWon() {
        return true;
    }

    public void turnToNextPlayer() {
        if (playerTurnIndex == 0) {
            playerTurnIndex = 1;
        } else {
            playerTurnIndex = 0;
        }
    }

}

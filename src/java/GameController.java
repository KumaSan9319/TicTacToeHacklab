public class GameController {

    private Game game;

    public GameController() {
        createNewGame();
        createPlayers();
    }

    public Game getGame() {
        return game;
    }

    public void createNewGame() {
        this.game = new Game();
    }

    public void createPlayers() {
        Player[] players = new Player[2];
        players[0] = new Player("Player 1", "X");
        players[1] = new Player("Player 2", "O");

        game.setPlayers(players);
    }

    public String getCurrentPlayer() {
        return game.getCurrentPlayer();
    }

    public String getPlayField() {
        return game.getPlayField();
    }

    public boolean isGameInProgress() {
        return true;
    }

    public boolean validatePlaceMarker() {
        return true;
    }

    public String placeMarker(String square) {
        return " ";
    }

    public String getWonLostOrDraw() {
        return " ";
    }

    public void turnToNextPlayer() {
        game.turnToNextPlayer();
    }

}

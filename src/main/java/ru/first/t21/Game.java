package ru.first.t21;

public class Game {
    private GameLevel gameLevel;

    public Game() {
    }

    public Game(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }

    public GameLevel getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(GameLevel gameLevel) {
        this.gameLevel = gameLevel;
    }
}

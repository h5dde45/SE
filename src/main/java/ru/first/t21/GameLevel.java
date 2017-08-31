package ru.first.t21;

public enum GameLevel {
    BEGINNER(0,"First"),
    PROFESSIONAL(1,"Second"),
    HARD(2,"Third");


    private int index;
    private String name;

    GameLevel(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}

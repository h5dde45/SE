package ru.first.t21;

public class Start {

    public static void main(String[] args) {
        for (int i = 0; i < GameLevel.values().length; i++) {
            System.out.println(GameLevel.values()[i]);
        }

        Game game=new Game();
        game.setGameLevel(GameLevel.BEGINNER);

        System.out.println(game.getGameLevel());

        if (game.getGameLevel()==GameLevel.BEGINNER){
            System.out.println("=============");
        }

        for(GameLevel gameLevel:GameLevel.values()){
            System.out.print(gameLevel.getIndex()+" = ");
            System.out.println(gameLevel.getName());
        }

    }

}

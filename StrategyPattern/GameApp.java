package StrategyPattern;

public class GameApp {
    public static void main(String[] args) {
        
        Character knight = new Knight();
        knight.attack();
        knight.defend();

        System.out.println();

        Character wizard = new Wizard();
        wizard.attack();
        wizard.defend();

        System.out.println();

        Character archer = new Archer();
        archer.attack();
        archer.defend();

        System.out.println();
        
        knight.attack();
        archer.attack();
        wizard.attack();

        System.out.println();

        wizard.attack();
        wizard.defend();
        archer.attack();
        archer.defend();
        knight.attack();
        knight.defend();

    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        // Create new game piece
        GamePiece mario = new GamePiece();

        // Set name and color of new game piece
        mario.setName("Mario");
        mario.setColor("Red");

        // Get name and color of new game piece
        mario.getColor();
        mario.getName();

        // Checking that the initial status of the new piece is set to unfrozen
        mario.getIsFrozen();

        // Test to make sure that it sets the game piece to frozen status while it is currently not frozen
        mario.freeze();
        mario.getIsFrozen();

        // Test to make sure that it sets the game piece to unfrozen status while it is currently frozen
        mario.unfreeze();
        mario.getIsFrozen();

        // Test to see if you can move properly while unfrozen
        mario.getPositionX();
        mario.getPositionY();
        System.out.println("Moving now.");
        mario.move();
        mario.getPositionX();
        mario.getPositionY();

        // Test to see if, while frozen, the piece does not move
        mario.freeze();
        System.out.println("Moving again.");
        mario.move();

    }
}

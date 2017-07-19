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

        // Test to make sure that it sets the game piece to frozen status while it is currently not frozen
        mario.freeze();
        if (mario.getIsFrozen()) {
            System.out.println("Freeze works properly");
        } else {
            System.out.println("Freeze does not work");
        }

        // Test to make sure that it sets the game piece to unfrozen status while it is currently frozen
        mario.unfreeze();
        if (mario.getIsFrozen()) {
            System.out.println("Unfreeze does not work");
        } else {
            System.out.println("Unfreeze does work");
        }

        // Test to see if you can move properly while unfrozen
        mario.move();
        if (mario.getPositionX() != 0 && mario.getPositionY() != 0) {
            System.out.println("Moved successfully");
        } else {
            System.out.println("Did not move");
        }
        // Test to see if, while frozen, the piece does not move
        mario.freeze();
        mario.move();
        if (mario.getPositionX() != 0 && mario.getPositionY() != 0) {
            System.out.println("Moved while frozen");
        } else {
            System.out.println("Did not move while frozen");
        }
    }
}

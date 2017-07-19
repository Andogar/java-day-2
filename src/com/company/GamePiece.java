package com.company;

import java.util.*;

public class GamePiece {
    int positionX;
    int positionY;
    boolean isFrozen;
    String name;
    String color;
    Random randomNum = new Random();

    public GamePiece() {
        positionX = 0;
        positionY = 0;
        isFrozen = false;
    }

    public int getPositionX() {
        return positionX;
    }


    public int getPositionY() {
        return positionY;
    }

    public boolean getIsFrozen() {
        return isFrozen;
    }

    public String getName() {
        System.out.println("Hello " + name + "!");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        System.out.println("You are " + color + "!");
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move() {
        if (isFrozen) {
            System.out.println("You're frozen, unfreeze to be able to move!");
        } else {
            this.positionX = randomNum.nextInt(100);
            this.positionY = randomNum.nextInt(100);
            ;
        }
    }

    public void freeze() {
        isFrozen = true;
    }

    public void unfreeze() {
        isFrozen = false;
    }
}

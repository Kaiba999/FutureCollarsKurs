package com.futurecollars.lesson3.ex1;

public class CinemaPlace {
    private final int number;
    private final int row;
    private boolean isFree;

    public CinemaPlace(int number, int row, boolean isFree) {
        this.number = number;
        this.row = row;
        this.isFree = isFree;
    }
}

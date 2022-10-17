package com.futurecollars.lesson7.ex5;

import java.time.Month;

public class MonthToSeasonConverter {

    public Season convertMonthToSeason(Month month) {
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                return Season.WINTER;
            case MARCH:
            case APRIL:
            case MAY:
                return Season.AUTUMN;
            case JUNE:
            case JULY:
            case AUGUST:
                return Season.SUMMER;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                return Season.SPRING;

            default:
                throw new IllegalArgumentException("Nie ma takiego miesiąca!");


        }
    }
}

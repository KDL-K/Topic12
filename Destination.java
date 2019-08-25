package com.company;

import java.time.ZoneOffset;

public enum Destination {
    MOSKOW("Москва",3),
    MINSK("Минск",3),
    WARSAW("Варшава", 2),
    BERLIN("Берлин",2);
    String nameOfDestination;
    int timeZone;
    Destination(String nameOfDestination, int timeZone){
        this.nameOfDestination=nameOfDestination;
    }

    public String getNameOfDestination() {
        return nameOfDestination;
    }

    public int getTimeZone() {
        return timeZone;
    }

    @Override
    public String toString() {

        return  nameOfDestination+" ";
    }
}

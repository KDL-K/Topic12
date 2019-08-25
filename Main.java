package com.company;

import java.time.Month;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Birthday birthday=new Birthday(Month.MAY,22);
        System.out.println("MY BIRTHDAYs:");
        birthday.showBirthdayByYear(80);

        System.out.println("\n\n");
        TimeTable timeTable=new TimeTable(2019,Month.AUGUST,26,10,17,Destination.MOSKOW);
        System.out.println(timeTable.toString());
        timeTable.showTimeOfDestination(Destination.MINSK,7,54);
        timeTable.showTimeOfDestination(Destination.WARSAW,14,32);
        timeTable.showTimeOfDestination(Destination.BERLIN,22,0);
    }


}

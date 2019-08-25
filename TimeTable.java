package com.company;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeTable {
    private Destination start;
    private int year;
    private Month month;
    private int day;
    private int hours;
    private int minutes;
    private OffsetDateTime offdtStart;

    public TimeTable(int year, Month month, int day, int hours, int minutes, Destination start){
        this.year=year;
        this.month=month;
        this.day=day;
        this.hours=hours;
        this.minutes=minutes;
        this.start=start;
        ZoneOffset zoneStart=ZoneOffset.ofHours(start.getTimeZone());
        offdtStart=OffsetDateTime.of(year,month.getValue(),day,hours,minutes,0,0,zoneStart);
    }

    public void showTimeOfDestination(Destination destination, int hoursOfWay, int minutesOfWay){
        int timeOfWay=hoursOfWay*60+minutesOfWay;
        ZoneOffset zoneDestination=ZoneOffset.ofHours(destination.getTimeZone());
        OffsetDateTime offdtDestination=offdtStart.withOffsetSameInstant(zoneDestination).plusMinutes(timeOfWay);
        System.out.println("ARRIVING: "+destination.getNameOfDestination()+"   "+offdtDestination.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
    }

    @Override
    public String toString() {
        return "LEAVING: "+this.start.getNameOfDestination()+"   "+offdtStart.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }
}

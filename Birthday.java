package com.company;

import java.time.MonthDay;
import java.time.Month;
import java.time.Year;
import java.util.Objects;

public class Birthday {
    private MonthDay md;

    public Birthday(){}

    public Birthday(Month month, int day){
        md=MonthDay.of(month, day);
    }

    public void showBirthdayByYear(int howManyYears){

        for(int i = 0;i<howManyYears;i++){
            System.out.println(md.atYear(Year.now().getValue()+i)+" "+md.atYear(Year.now().getValue()+i).getDayOfWeek());
        }
    }

    public MonthDay getMd() {
        return md;
    }

    public void setMd(Month month, int day) {
        md=MonthDay.of(month, day);;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return Objects.equals(md, birthday.md);
    }

    @Override
    public int hashCode() {
        return Objects.hash(md);
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "md=" + md +
                '}';
    }
}

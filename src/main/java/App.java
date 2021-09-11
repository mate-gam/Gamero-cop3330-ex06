/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Gamero Mateo
 */
import java.io.Console;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class App
{
    public static void main(String[] args)
    {
        Console con = System.console();
        String age = con.readLine("What is your current age? ");
        String retire = con.readLine("At what age would you like to retire? ");
        int ag = Integer.parseInt(age);
        int ret = Integer.parseInt(retire);
        int retTime = ret - ag;
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        System.out.printf("You have %d years left until you can retire.\nIt's %d, so you can retire in %d",
                retTime, year, year + retTime);
    }
}

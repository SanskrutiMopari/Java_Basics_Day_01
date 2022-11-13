package Assignment_Day_01;

import java.util.Scanner;

// Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year???
public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter an Year :: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}

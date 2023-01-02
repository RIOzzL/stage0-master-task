package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 0 || month < 0 || month > 12) {
            System.out.println("invalid date");
        } else {
            int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            //For checking leap year
            if (month == 2 && ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0))))
                System.out.println(arr[month - 1] + 1);
            else System.out.println(arr[month - 1]);
        }
    }
}

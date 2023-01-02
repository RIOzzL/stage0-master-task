package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int res = 0;
        while (number != 0) {
            res += number % 10;
            number /= 10;
        }
        System.out.println(res);
    }
}

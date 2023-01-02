package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++)
        {
            for (int column = 1; column <= cathetusLength - row; column++)
            {
                System.out.print(" ");
            }
            for (int num = row; num >= 1; num--)
            {
                System.out.print((num>=10)?+num:num);
            }
            for (int num = 2; num <= row; num++)
            {
                System.out.print((num>=10)?+num:num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}

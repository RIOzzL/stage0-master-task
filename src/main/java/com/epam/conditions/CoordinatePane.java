package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if(x>0 && y>0)
            System.out.println("first");

            //find second quadrant
        else if(x<0 && y>0)
            System.out.println("second");

            //To find third quadrant
        else if(x<0 && y<0) System.out.println("third");

            //To find Fourth quadrant
        else if (x > 0 && y < 0)
            System.out.println("fourth");

            //To find dose not lie on origin
        else if (x == 0 && y == 0)
            System.out.println("zero");
    }
}


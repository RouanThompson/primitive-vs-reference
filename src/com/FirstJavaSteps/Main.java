package com.FirstJavaSteps;

import java.awt.*;
// When using a class from an other package the import keyword followed by the package name is declared

public class Main {

    public static void main(String[] args) {
        // Primitive types
        byte x = 1;
        byte y = 1;
        // The value of x and y are independent of each other.
        System.out.println(y);
        x = 2;
        System.out.println(y);
        // The value of y does not change because x and y variables have their
        // Own memory address which at that address have their own value.

        // Reference Types
        Point point1 = new Point(4, 4);
        // point1 is a variable that holds the address of the Point() object.
        // A Class is a blue print. For example: Ship is a class.
        // When I build the Ship with new keyword I have then created a instance of Ship.
        // Objects and Classes can both use dot notation to access their members or fields
        System.out.println(point1);
        // point1 does not hold a value it holds the address of the Point object
        // That is why java.awt.Point[x=4,y=4] is displayed and not point1
        Point point2 = point1;
        System.out.println(point2);
        // point2 now has a copy of the address that point1 holds. Therefore point1 & point2 refer to the same object.
        point1.x = 80;
        // By using the dot notation on the point1 I can access and change the value of x variable of Point object
        // This is a key difference between reference type vs primitive types.
        System.out.println(point2);
    }
}

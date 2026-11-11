
package com.example.circle_area;

public class App {

    public static void main(String[] args) {

        double radius = 5.0;

        double area = Math.PI * radius * radius;

        System.out.println("Radius = " + radius);

        System.out.printf(
            java.util.Locale.US,
            "Area of Circle = %.2f%n",
            area
        );
    }
}

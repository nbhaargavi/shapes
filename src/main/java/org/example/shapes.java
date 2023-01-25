package org.example;

import java.util.Scanner;

public class shapes {
    private String type;
    private double[] dimensions;

    public shapes(String type, double[] dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public double getPerimeter() {
        double perimeter = 0;
        if (type.equals("triangle")) {
            perimeter = dimensions[0] + dimensions[1] + dimensions[2];
        } else if (type.equals("rectangle")) {
            perimeter = 2 * (dimensions[0] + dimensions[1]);
        } else if (type.equals("circle")) {
            perimeter = 2 * Math.PI * dimensions[0];
        }
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        if (type.equals("triangle")) {
            double s = (dimensions[0] + dimensions[1] + dimensions[2]) / 2;
            area = Math.sqrt(s * (s - dimensions[0]) * (s - dimensions[1]) * (s - dimensions[2]));
        } else if (type.equals("rectangle")) {
            area = dimensions[0] * dimensions[1];
        } else if (type.equals("circle")) {
            area = Math.PI * dimensions[0] * dimensions[0];
        }
        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] dimensions = new double[3];

        System.out.println("Enter the type of shape");
        String type = sc.next();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the " + i + "dimension value");
            dimensions[i] = sc.nextInt();
        }
        shapes s1 = new shapes(type, dimensions);

        System.out.println("Area of " + type +": " +s1.getArea());
        System.out.println("Perimeter of " + type +": " + s1.getPerimeter());
    }
}

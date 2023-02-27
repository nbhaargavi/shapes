package org.example;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.*;

public class shapes {
    Logger l=Logger.getLogger("kitty");
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
        Scanner sc=new Scanner(System.in);
        Logger l=Logger.getLogger("kitty");
        double[] dimensions = new double[3];

        l.log(Level.INFO,() ->"Enter the type of shape");
        String type = sc.next();
        shapes s1 = new shapes(type, dimensions);
        if(type.equals( "circle"))
        {
                l.info("Enter the radius ");
                dimensions[0] = sc.nextInt();
            l.log(Level.INFO,() ->"Area of " + type +": " +s1.getArea());
            l.log(Level.INFO,() ->"Perimeter of " + type +": " + s1.getPerimeter());
        }
        else if(type.equals( "rectangle"))
        {
            l.info("Enter the length ");
            dimensions[0] = sc.nextInt();
            l.info("Enter the breadth ");
            dimensions[1] = sc.nextInt();
            l.log(Level.INFO,() ->"Area of " + type +": " +s1.getArea());
            l.log(Level.INFO,() ->"Perimeter of " + type +": " + s1.getPerimeter());
        }

        else
        {
            l.info("Enter the base ");
            dimensions[0] = sc.nextInt();
            l.info("Enter the height ");
            dimensions[1] = sc.nextInt();
            l.info("Enter the length ");
            dimensions[2] = sc.nextInt();
            l.log(Level.INFO,() ->"Area of " + type +": " +s1.getArea());
            l.log(Level.INFO,() ->"Perimeter of " + type +": " + s1.getPerimeter());
        }

    }
}

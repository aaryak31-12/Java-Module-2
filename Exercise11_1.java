import java.util.Scanner;

public class Exercise11_1 {

    public static void main(String[] args) {

        // creating scanner object for user input
        Scanner input = new Scanner(System.in);

        // asking user to enter the three sides
        System.out.print("Enter side1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side3: ");
        double side3 = input.nextDouble();

        // asking user to enter the color
        System.out.print("Enter a color: ");
        String color = input.next();

        // asking whether the triangle is filled
        System.out.print("Is the triangle filled (true or false): ");
        boolean filled = input.nextBoolean();

        // creating a triangle object using the three sides
        Triangle triangle = new Triangle(side1, side2, side3);

        // Setting color and filled properties
        triangle.setColor(color);
        triangle.setFilled(filled);

        // displaying area, perimeter, color, and filled value
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());
    }
}
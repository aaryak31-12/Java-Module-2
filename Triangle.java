public class Triangle extends GeometricObject {


    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    // Constructor creates a triangle with specified sides
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // returning side 1
    public double getSide1() {
        return side1;
    }

    // returning side 2
    public double getSide2() {
        return side2;
    }

    // returning side 3
    public double getSide3() {
        return side3;
    }

    // returning area of the triangle
    public double getArea() {

        // calculaing s using the formula from 2.19
        double s = (side1 + side2 + side3) / 2;

        // calculating and returning the area
        return Math.sqrt(s * (s - side1) *
                (s - side2) * (s - side3));
    }

    // returning the perimeter of the triangle
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // returning a string description of the triangle
    public String toString() {
        return "Triangle: side1 = " + side1 +
                " side2 = " + side2 +
                " side3 = " + side3;


    }







}




















package am.armen181.open_closed_principle;

interface Shape {
    public double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {

    public double radius;

    public double calculateArea() {
        return (22 / 7) * radius * radius;
    }
}

class AreaCalculator {
    public double calculateArea(final Shape shape) {
        return shape.calculateArea();
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

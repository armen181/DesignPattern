package am.armen181.interface_segregation.example_1;

public class Cube implements SolidShapeInterface, ShapeInterface, ManageShapeInterface {
    @Override
    public double volume() {
        return 1.0;
    }

    @Override
    public double area() {
        return 1.0;
    }

    @Override
    public double calculate() {
        return this.area() + this.volume();
    }
}

package am.armen181.interface_segregation.example_1;

public class Square implements ShapeInterface, ManageShapeInterface {

    @Override
    public double area() {
        return 2.0;
    }

    @Override
    public double calculate() {
        return this.area();
    }
}

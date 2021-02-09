package am.armen181.programming_to_an_interface;

public class Projector implements DisplayModule {
    @Override
    public void display() {
        System.out.println("This is Projector");
    }
}

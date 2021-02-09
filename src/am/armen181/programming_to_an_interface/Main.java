package am.armen181.programming_to_an_interface;

public class Main {

    public static void main(String[] args) {
        final Computer computer = new Computer();
        computer.setDm(new Monitor());
        computer.display();
        computer.setDm(new Projector());
        computer.display();
    }
}

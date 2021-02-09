package am.armen181.programming_to_an_interface;

public class Computer {

    DisplayModule dm;

    public void setDm(DisplayModule dm) {
        this.dm = dm;
    }

    public void display() {
        dm.display();
    }
}

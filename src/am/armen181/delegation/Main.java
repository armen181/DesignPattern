package am.armen181.delegation;

class RealPrinter {
    void print() {
        System.out.println("The Delegate");
    }
}

class Printer {
    final private RealPrinter p = new RealPrinter();
    void print() {
        p.print();
    }
}
class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.print();
    }
}

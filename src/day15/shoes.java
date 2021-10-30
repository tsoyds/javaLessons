package day15;

public class shoes {
    String name;

    int size;
    int quantity;

    public shoes(String name, int size, int quantity) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return  name + ", " + size + ", " + quantity;
    }
}

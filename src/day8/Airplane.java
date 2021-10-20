package day8;

public class Airplane {
    String producer;
    int year;
    int length;
    int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight){
        this.producer=producer;
        this.year=year;
        this.length=length;
        this.weight=weight;
    }
    public void info() {
        StringBuilder str = new StringBuilder();
        str.append("Producer is " + producer);

        System.out.println("Producer is " + producer);
        System.out.println("Year of produced is "+ year);
        System.out.println("Length is "+ length);
        System.out.println("Weight is "+ weight);
        System.out.println("Amount of fuel is "+ fuel);
    }
    public int fillUp(int fuel){
        this.fuel = fuel;
        return fuel;
    }

}

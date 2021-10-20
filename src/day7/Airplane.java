package day7;

public class Airplane {
    String producer;
    int year;
    private int length;
    int weight;
    private int fuel;
    private static int biggerAirplane;
    private static int i1;
    private static int i2;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight){
        this.producer=producer;
        this.year=year;
        this.setLength(length);
        this.weight=weight;
        biggerAirplane++;
    }
    public void info() {
        System.out.println("Producer is " + producer);
        System.out.println("Year of produced is "+ year);
        System.out.println("Length is "+ getLength());
        System.out.println("Weight is "+ weight);
        System.out.println("Amount of fuel is "+ fuel);
    }
    public int fillUp(int fuel){
        this.fuel = fuel;
        return fuel;
    }

    static void compareAirplanes (day6.Airplane airplane1, day6.Airplane airplane2){
        //static int
        System.out.println("Airplane has bigger length");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

package day6;

public class Main {
    public static void main (String[] args){
       /* car Car = new car();
        Car.setColor("Red");
        Car.setModel("Lancer");
        Car.setYear(1999);
        Motorbike Suzuki = new Motorbike(2017, "Orange", "910");
        Car.info();
        //Car.yearDifference(2021);
        System.out.println(Car.yearDifference(2021));

        */
        Airplane Boing = new Airplane("AeroKing", 2008, 150, 30000);
        Boing.fillUp(3000);
        Boing.info();

        System.out.println(Boing.getFuel());
    }
}

package day1til5;

public class day5 {
    public static void main (String[] args){
        car Mitsubishi = new car();
        Mitsubishi.setYear(1999);
        Mitsubishi.setColor("Red");
        Mitsubishi.setModel("Lancer");
        System.out.println(Mitsubishi.getYear());
        System.out.println(Mitsubishi.getColor());
        System.out.println(Mitsubishi.getModel());
        Motorbike Suzuki = new Motorbike(2011, "black", "410");
        System.out.println(Suzuki.color);
        System.out.println(Suzuki.year);
        System.out.println(Suzuki.model);
    }

}

class car {
    private int year;
    private String color;
    private String model;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
class Motorbike{
    int year;
    String color;
    String model;
    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color=color;
        this.model=model;
    }



}
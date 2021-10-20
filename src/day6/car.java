package day6;

public class car {
    private int year;
    private String color;
    private String model;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor(String red) {
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

    public static void info(){
        System.out.println("This is auto");
    }

    public int yearDifference(int newYear){
        int i = newYear-this.year;
        return i;

                //return yearDifference(year-this.year);
    }
}

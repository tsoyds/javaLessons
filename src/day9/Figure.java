package day9;

import java.util.ServiceConfigurationError;

public abstract class Figure {
    private String color;
    public Figure (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public double area();
    abstract public double perimeter();


}

class Circle extends Figure{
    private int R;
    public Circle (String color, int R) {
        super(color);
        this.setR(R);
    }
    public int getR() {
        return R;
    }
    public void setR(int r) {
        R = r;
    }
    @Override
    public double area (){
        double area = R*R*Math.PI;
        return area;
    }
    @Override
    public double perimeter(){
        double perimeter = 2*Math.PI*R;
        return perimeter;
    }
}

class Rectangle extends Figure{
    private int width;
    private int length;
    public Rectangle(String color, int width, int length){
        super(color);
        this.width=width;
        this.length=length;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public double area(){
        double area = width*length;
        return area;
    }
    @Override
    public double perimeter(){
        double perimeter = 2*(length+width);
        return perimeter;
    }
}

class Triangle extends Figure{
    private int length1;
    private int length2;
    private int length3;
    public Triangle(String color, int length1, int length2, int length3){
        super(color);
        this.length1=length1;
        this.length2=length2;
        this.length3=length3;
    }
    public int getLength1() {
        return length1;
    }

    public void setLength1(int length1) {
        this.length1 = length1;
    }

    public int getLength2() {
        return length2;
    }

    public void setLength2(int length2) {
        this.length2 = length2;
    }

    public int getLength3() {
        return length3;
    }

    public void setLength3(int length3) {
        this.length3 = length3;
    }
    @Override
    public double area(){
        double area = Math.sqrt(perimeter()/2*(perimeter()/2-length1)*
                (perimeter()/2-length2)*(perimeter()/2-length3));
        return area;
    }

    @Override
    public double perimeter() {
        double  perimeter = length1+length2+length3;
        return perimeter;
    }
}

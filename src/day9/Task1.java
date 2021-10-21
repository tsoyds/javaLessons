package day9;

public class Task1 {
    public static void main (String[] args){
        Student student1 = new Student("Ivan", "Berserks");
        Teacher teacher1 = new Teacher("Vsevolod Y'urevich", "Math");
        student1.printInfo();
        teacher1.printInfo();
    }

}

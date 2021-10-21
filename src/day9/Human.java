package day9;

public class Human {
    private String name;

    public String getName() {
        return name;
    }

    public Human (String name){
        this.name=name;
    }


    public void printInfo(){

        System.out.println("This is human with name: "+this.name);
    }
}
class Student extends Human {
    private String studentGroup;

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }
    private String groupName;
    public Student (String name, String groupName){
       super(name);
       this.groupName=groupName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("This is a student with name: "+ super.getName());
    }

}

class Teacher extends Human {
    String lessonName;
    public String getLessonName() {
        return lessonName;
    }
    public Teacher (String name, String lessonName){
        super(name);
        this.lessonName = lessonName;
    }

    public void printInfo(){
        super.printInfo();
        System.out.println("This is teacher with name: "+ super.getName());
    }
}
package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main (String[] args){
        List<String> autoList = new ArrayList<>();
        autoList.add("Mazda 3");
        autoList.add("RAV 4");
        autoList.add("Toyota Camry");
        autoList.add("Hyundai Solaris");
        autoList.add("Kia Rio");
        System.out.println(autoList);
        autoList.remove(1);
        System.out.println(autoList);
        
        

    }


}

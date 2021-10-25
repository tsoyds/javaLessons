package day11;

public class Task1 {
    public static void main (String[] args){
        Warehouse warehouse = new Warehouse();
        Courier courier1 = new Courier(warehouse);
        Picker picker1 = new Picker(warehouse);

        System.out.println(warehouse);
        System.out.println(picker1);
        System.out.println(courier1);
        for (int i=0; i<=1500; i++){
            courier1.doWork();
            picker1.doWork();

        }
        courier1.bonus();
        picker1.bonus();
        System.out.println(warehouse);
        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(courier1.getSalary());
        System.out.println(picker1.getSalary());

        Warehouse wb = new Warehouse();
        wb.setCountOrder(10);
        wb.setBalance(900);



    }
}

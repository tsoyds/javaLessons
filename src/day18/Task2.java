package day18;

public class Task2 {
    private static int counter;
    public static void main(String[] args) {
        System.out.println(count7(77748745));
    }

    private static int count7 (int i){
        if (i%10==7) counter=1; else counter=0;
        //System.out.println(i%10);
        if (i==0) return 0;
        i=i/10;
        return (counter+count7(i));
    }
}

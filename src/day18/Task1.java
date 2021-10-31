package day18;

public class Task1 {
    public static void main(String[] args) {
        int [] numbers = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
        System.out.println(recursionSum(numbers));
    }
    static int i=-1;
    static int sum;
    private static int recursionSum (int[] massive)
    {   i++;
        if (i >= massive.length) return 0;
        return sum = massive[i]+recursionSum(massive);
    }
}

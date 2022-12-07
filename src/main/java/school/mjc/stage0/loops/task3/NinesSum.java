package school.mjc.stage0.loops.task3;

public class NinesSum {

    public static void main(String[] args) {
        calculateSum(6);
    }
    public static void calculateSum(int lengthOfLastNumber) {

        int result = 0;
        int temp = 0;
        for (int i = 0; i <= lengthOfLastNumber; i++) {
            temp = (int) Math.pow(10, i);
            result += --temp;
        }
        System.out.println(result);

        //int result = (int) Math.pow(10, lengthOfLastNumber);
        //System.out.println(result - 1);
    }
}

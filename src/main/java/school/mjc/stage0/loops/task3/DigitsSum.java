package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t > 0) {
            int sum = 0;
            int current = t;
            while (current > 0) {
                sum += current%10;
                current = current/10;
            }
            System.out.println(sum);
        } else if (t < 0) {
            int sum = 0;
            int current = t * -1;
            while (current > 0) {
                sum += current%10;
                current = current/10;
            }
            System.out.println(sum);
        } else {
            System.out.println(0);
        }

    }
}

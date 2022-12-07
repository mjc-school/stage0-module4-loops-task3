package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == second) {
            System.out.println(first);
        } else if (first == 0) {
            System.out.println(second);
        } else if (second == 0) {
            System.out.println(first);
        } else if (first > second) {
            for (int i = second; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    System.out.println(i);
                    return;
                }
            }
        } else if (second > first) {
            for (int i = first; i > 0; i--) {
                if ((first % i == 0) && (second % i == 0)) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}

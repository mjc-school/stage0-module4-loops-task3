package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibNow = 0;
        int fibNext = 1;
        for (int i = 1; i <= lastFibonacci; ++i) {
            System.out.println(fibNow);
            int temp = fibNow + fibNext;
            fibNow = fibNext;
            fibNext = temp;
        }
    }
}

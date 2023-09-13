package adapter_task;

public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator();

        System.out.printf("SUM: %d\n", calc.sum(12, 15));
        System.out.printf("MULTIPLYING: %d\n", calc.mult(5, 6));
        System.out.printf("POW: %d\n", calc.pow(2, 4));

    }
}

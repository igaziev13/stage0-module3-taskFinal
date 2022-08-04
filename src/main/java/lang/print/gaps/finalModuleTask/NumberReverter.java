package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int num1 = number / 100;
        int num2 = (number % 100) / 10;
        int num3 = (number % 10) * 100;

        System.out.println(num1 + num2 * 10 + num3);
    }
}

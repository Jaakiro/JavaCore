package task.math;

public class ResultPrinter {
    private final int result;

    public ResultPrinter(int result) {
        this.result = result;
    }

    public void printResult(String string) {
        System.out.println("Полученный результат \t" + string + " " + result);
    }
}

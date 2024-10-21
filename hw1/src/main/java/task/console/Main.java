package task.console;

import task.math.Calculator;
import task.math.ResultPrinter;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        ResultPrinter printer = new ResultPrinter(calculator.add(5, 3));
        printer.printResult("Сложение");

        printer = new ResultPrinter(calculator.subtract(10, 3));
        printer.printResult("Вычитание");

        printer = new ResultPrinter(calculator.multiply(5, 3));
        printer.printResult("Умножение");

        printer = new ResultPrinter(calculator.divide(10, 3));
        printer.printResult("Деление");

        printer = new ResultPrinter(calculator.pow(2, 4));
        printer.printResult("Возведение в степень");

        printer = new ResultPrinter(calculator.factorial(5));
        printer.printResult("Факториал");
    }
}

/*
Команды терминала:
javac -sourcepath ./java -d out java/task/console/Main.java
java -classpath ./out task.console.Main
 */
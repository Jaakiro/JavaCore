package org.example.task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Program.hasTwoConsecutiveZeros(new int[]{1, 0, 0, 3}));
        System.out.println(Program.hasTwoConsecutiveZeros(new int[]{0, 1, 0, 3}));
        System.out.println(Program.hasTwoConsecutiveZeros(new int[]{1, 2, 3, 0, 0}));
    }
}


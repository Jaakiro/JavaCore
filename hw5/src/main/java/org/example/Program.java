package org.example;

import java.io.IOException;

import static org.example.BackupFunction.createBackup;

public class Program {
    public static void main(String[] args) throws IOException {
        String fn = "TicTacToe.txt";
        byte[] gameState = {2, 1, 0, 2, 0, 2, 0, 1, 3};

        // Создаем файл с данными массива
        new WriteToFile(gameState, fn);

        // Резервное копирование файлов из текущей директории в ./backup
        createBackup();

        // Печатаем состояние игрового поля
        System.out.println("Текущее состояние игрового поля:");
        TicTacToe.printGameState(gameState);
    }
}

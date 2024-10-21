package org.example;

import java.io.IOException;

import static org.example.backupFunction.createBackup;

public class Program {
    public static void main(String[] args) throws IOException {
        String fn = "TicTacToe.txt";
        byte[] arr = {2, 1, 0, 2, 0, 2, 0, 1, 3};

        // Создаем файл с данными массива
        new WriteToFile(arr, fn);

        // Резервное копирование файлов из текущей директории в ./backup
        createBackup();
    }
}

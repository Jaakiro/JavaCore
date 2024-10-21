package org.example;

public class TicTacToe {
    public static void printGameState(byte[] gameState) {
        if (gameState.length != 9) {
            throw new IllegalArgumentException("Игровое поле должно состоять из 9 ячеек.");
        }

        for (int i = 0; i < gameState.length; i++) {
            char symbol;
            switch (gameState[i]) {
                case 1:
                    symbol = 'X'; // крестик
                    break;
                case 2:
                    symbol = 'O'; // нолик
                    break;
                case 0:
                    symbol = '.'; // пустое поле
                    break;
                default:
                    symbol = '?'; // неизвестное значение
            }

            System.out.print(symbol + " ");

            // Переход на новую строку после каждых 3 элементов
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }
}

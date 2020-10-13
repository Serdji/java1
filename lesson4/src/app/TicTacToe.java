package app;

import java.util.Random;
import java.util.Scanner;


public class TicTacToe {

    public static int size;
    public static int dotsToWin;

    public static final char DOT_EMPTY = '•';
    public static final char DOT_HUMAN = 'X';
    public static final char DOT_AI = 'O';

    public static final String EMPTY = " ";
    public static final String EMPTY_FIRST = "♥ ";

    public static char[][] map;
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {

        turnGame();

    }

    private static void turnGame() {
        initPlayingField();

        initMap();

        printMap();

        playGame();
    }

    private static void initPlayingField() {
        do {
            System.out.println("Введите размер игрового поля.");
            System.out.println("Игровое поле не может быть меньше чем 3 х 3");
            System.out.print("размер = ");
            size = scanner.nextInt();
            map = new char[size][size];
            dotsToWin = quantityDotsToWin(size);
            System.out.println(dotsToWin);
        } while (size < 3);
    }

    private static int quantityDotsToWin(int size) {
        if (size >= 3 && size <= 5) return 3;
        if (size >= 6 && size <= 9) return 4;
        if (size >= 10) return 5;
        return 0;
    }

    private static void initMap() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }

    private static void printMapHeader() {
        if( size >= 10 ) {
            System.out.print(EMPTY_FIRST + EMPTY);
        } else {
            System.out.print(EMPTY_FIRST);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(i + 1 + EMPTY);
        }
        System.out.println();
    }

    private static void printMapRow() {
        for (int i = 0; i < size; i++) {
            if( i + 1 < 10 && size >= 10 ) {
                System.out.print(i + 1 + EMPTY + EMPTY);
            } else  {
                System.out.print(i + 1 + EMPTY );
            }
            for (int j = 0; j < size; j++) {
                if( j + 1 >= 10 ) {
                    System.out.print(map[i][j] + EMPTY + EMPTY);
                } else {
                    System.out.print(map[i][j] + EMPTY);
                }

            }
            System.out.println();
        }
        System.out.println();
    }

    private static void playGame() {


        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rowNumber, columnNumber;

        do {
//          wrap
            System.out.println("Ход человека! Введите номер строки и столбца!");

            System.out.print("Строка = ");
            rowNumber = scanner.nextInt();

            System.out.print("Столбец = ");
            columnNumber = scanner.nextInt();

        } while (!isCellValid(rowNumber, columnNumber));

        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber, boolean isAI) {

        if (!isAI && ((rowNumber < 1) || (rowNumber > size) || (columnNumber < 1) || (columnNumber > size))) {
            System.out.println("\nПроверьте значения строки и столбца");
            return false;
        }

        if (map[rowNumber - 1][columnNumber - 1] != DOT_EMPTY) {
            if (!isAI)
                System.out.println("\nВы выбрали занятую ячйку!");
            return false;
        }

        return true;
    }

    private static boolean isCellValid(int rowNumber, int columnNumber) {
        return isCellValid(rowNumber, columnNumber, false);
    }

    private static boolean checkEnd(char symbol) {

        boolean isEnd = false;

        if (isWin(symbol)) {
            String winMessage;
            if (symbol == DOT_HUMAN) {
                winMessage = "УРА! Вы победили!";
            } else {
                winMessage = "Восстание близко! AI победил!";
            }
            System.out.println(winMessage);
            isEnd = true;
        }

        if (isMapFull()) {
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }
        return isEnd;
    }

    private static boolean isWin(char symbol) {
        return checkRowAndCol(symbol) || checkDiagonals(symbol) || heckDiagonalSideways(symbol);
    }

    private static boolean checkRowAndCol(char symbol) {
        return checkRow(symbol) || checkCol(symbol);
    }

    private static boolean checkRow(char symbol) {
        int charRowCounter = 0;
        boolean res = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == symbol) {
                    charRowCounter++;
                    res = charRowCounter >= dotsToWin;
                } else {
                    charRowCounter = 0;
                }
            }
        }
        return res;
    }

    private static boolean checkCol(char symbol) {
        int charColCounter = 0;
        boolean res = false;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[j][i] == symbol) {
                    charColCounter++;
                    res = charColCounter >= dotsToWin;
                } else {
                    charColCounter = 0;
                }
            }
        }
        return res;
    }

    private static boolean checkDiagonals(char symbol) {
        return checkDiagonalLeft(symbol) || checkDiagonalRight(symbol);
    }

    private static boolean heckDiagonalSideways(char symbol) {
        return checkDiagonalSidewaysLeft(symbol) || checkDiagonalSidewaysRight(symbol);
    }

    private static boolean checkDiagonalLeft(char symbol) {
        int checkDiagonalsLeftCount = 0;
        boolean res = false;
        for (int i = 0; i < size; i++) {
            if (map[i][i] == symbol) {
                checkDiagonalsLeftCount++;
                res = checkDiagonalsLeftCount >= dotsToWin;
            } else {
                checkDiagonalsLeftCount = 0;
            }
        }
        return res;
    }

    private static boolean checkDiagonalRight(char symbol) {
        int checkDiagonalsRightCount = 0;
        boolean res = false;
        for (int i = 0, j = size - 1; i < size; i++, j--) {
            if (map[i][j] == symbol) {
                checkDiagonalsRightCount++;
                res = checkDiagonalsRightCount >= dotsToWin;
            } else {
                checkDiagonalsRightCount = 0;
            }
        }
        return res;
    }

    private static boolean checkDiagonalSidewaysLeft(char symbol) {
        int checkDiagonalSidewaysLeftCountUp = 0;
        int checkDiagonalSidewaysLeftCountDown = 0;
        int bias = 0;
        boolean res = false;
        for (int i = 0; i < size; i++) {
            bias++;
            for (int j = 0; j < size; j++) {

//                if( j - bias >= 0 ) System.out.printf("j: %d , j: %d\n", j, j - bias);

                if ((j + bias < size) && map[j][j + bias] == symbol) {


                    checkDiagonalSidewaysLeftCountUp++;

//                    System.out.printf("В верх %d %c, %d : %d\n", checkDiagonalSidewaysLeftCountUp, map[j][j + bias], j + 1, j + bias + 1);

                    res = checkDiagonalSidewaysLeftCountUp >= dotsToWin;
                    if (res) break;

                } else if (j - bias >= 0 && map[j][j - bias] == symbol) {
                    checkDiagonalSidewaysLeftCountDown++;


//                    System.out.printf("В низ %d %c, %d : %d\n", checkDiagonalSidewaysLeftCountDown, map[j][j - bias], j + 1, j - bias + 1 );

                    res = checkDiagonalSidewaysLeftCountDown >= dotsToWin;
                    if (res) break;
                } else {
                    checkDiagonalSidewaysLeftCountUp = 0;
                    checkDiagonalSidewaysLeftCountDown = 0;
                }
            }
        }
        return res;
    }

    private static boolean checkDiagonalSidewaysRight(char symbol) {
        int checkDiagonalSidewaysRightCountUp = 0;
        int checkDiagonalSidewaysRightCountDown = 0;
        int bias = 0;
        boolean res = false;
        for (int i = 0; i < size; i++) {
            bias--;
            for (int j = size - 1; j >= 0; j--) {
                if( j - bias < size) System.out.printf("%d - %d\n", size - 1 - j, j - bias);
//                if( j - bias < size) map[size - 1 - j][j - bias] = 1;

                if ((j + bias >= 0) && map[size - 1 - j][j + bias] == symbol) {
                    checkDiagonalSidewaysRightCountUp++;

//                    System.out.printf("В верх %d %c, %d : %d\n", checkDiagonalSidewaysRightCountUp, map[size - 1 - j][j + bias], size - 1 - j + 1, j + 1 + bias);

                    res = checkDiagonalSidewaysRightCountUp >= dotsToWin;
                    if (res) break;

                } else if ((j - bias < size) && map[size - 1 - j][j - bias] == symbol) {

//                    if( j - bias < size) System.out.printf("%d - %d\n", size - 1 - j, j - bias);

                    checkDiagonalSidewaysRightCountDown++;

//                    System.out.printf("В низ %d %c, %d : %d\n", checkDiagonalSidewaysRightCountDown, map[size - 1 - j][j - bias], size - 1 - j + 1, j + 1 - bias);

                    res = checkDiagonalSidewaysRightCountDown >= dotsToWin;
                    if (res) break;


                } else {
                    checkDiagonalSidewaysRightCountUp = 0;
                }

            }

        }

        return res;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char aChar : chars) {
                if (aChar == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void aiTurn() {
        int rowNumber, columnNumber;

        do {
            rowNumber = random.nextInt(size) + 1;
            columnNumber = random.nextInt(size) + 1;

        } while (!isCellValid(rowNumber, columnNumber, true));

        map[rowNumber - 1][columnNumber - 1] = DOT_AI;
    }


}

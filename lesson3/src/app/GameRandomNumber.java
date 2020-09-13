package app;

import java.util.Random;
import java.util.Scanner;

public class GameRandomNumber {

   public static Scanner in = new Scanner(System.in);

    public void run() {
        gameComplexity();
    }

    public static void gameComplexity() {
        System.out.println("\u001B[33m");
        System.out.println("\nВыберите уровень сложности");
        System.out.println("1. Легкий: числа от 1 до 5");
        System.out.println("2. Средний: числа от 1 до 10 ");
        System.out.println("3. Сложный: числа от 1 до 20");
        System.out.println("4. Очень сложный: числа от 1 до 50");
        System.out.println("0. Выход");
        complexityChooseAction();
    }

    public static void complexityChooseAction() {
        try{
            int req = Integer.parseInt(in.next());
            switch (req ){
                case 1: generationNumber("Легкий", 5); break;
                case 2: generationNumber("Средний", 10); break;
                case 3: generationNumber("Сложный", 20); break;
                case 4: generationNumber("Очень сложный", 50); break;
                case 0: doExit(); break;
            }
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не число, попробуйте еще раз!");
            complexityChooseAction();
        }
    }

    public static void generationNumber(String str, int val) {
        Random random = new Random();
        System.out.println("\u001B[31m");
        System.out.printf("Вы выбрали уровень сложности: %s\n", str);
        System.out.println("\u001B[36m");
        System.out.printf("Угадай число от 1 до %d\n", val);

        int randomNumber = random.nextInt( val + 1 );
        startGame( randomNumber );
    }

    public static void startGame(int randomNumber) {
        try {
            while (true) {
                int req = Integer.parseInt(in.next());
                if (randomNumber < req) {
                    System.out.println("Число меньше");
                } else if (randomNumber > req) {
                    System.out.println("Число больше");
                } else if (randomNumber == req) {
                    System.out.println("Поздравляем, Вы УГАДАЛИ !!!!!!!!!!!");
                    System.exit(0);
                    in.close();
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Вы ввели не число, попробуйте еще раз!");
            startGame(randomNumber);
        }
    }

    private static void doExit() {
        System.out.println("Вы уверены? y/n");
        String req = in.next();
        if ( req.equals("y") ) {
            System.exit(0);
            in.close();
        }
        if ( req.equals("n") ) {
            gameComplexity();
        }
    }

}

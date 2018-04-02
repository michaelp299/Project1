/**
 * @author Mikhail Palku
 *
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие:\n1 - Калькулятор\n2 - Поиск максимального слова в массиве");
        byte i = scanner.nextByte();

        switch (i) {
            case 1:
                Calculator calculator = new Calculator();
                calculator.input();
                System.out.print("Ответ: ");
                calculator.choice();
                break;

            case 2:
                System.out.println("\nВведите количество слов для обработки:");
                int wordCount;
                if(scanner.hasNextInt()) {
                    wordCount = scanner.nextInt();

                    Words str = new Words(wordCount);
                    System.out.printf("Введите %d слов:\n", wordCount);

                    str.inputWords();
                    str.output(str.searchLongWord());
                    break;
                }
                else System.out.println("Вы ввели не целое число");
            default: System.out.println("Ошибка выбора действия");
        }

        scanner.close();
    }

}

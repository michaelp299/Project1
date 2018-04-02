/**
 * @author Mikhail Palku
 * @see #summ(double,double)
 */

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double i = scanner.nextDouble();                //ввод первого числа
        System.out.println("Введите второе число");
        double j = scanner.nextDouble();                //ввод второго числа

        System.out.printf("Сумма = %.4f", summ(i,j));   //вывод суммы

        scanner.close();
    }

    /**
     *
     * @param x первое число
     * @param y второе число
     * @return  Сумма
     */
    public static double summ(double x, double y){
        return x + y;
    }
}

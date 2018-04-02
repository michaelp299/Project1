import Operations.*;

import java.util.Scanner;

public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private String sign;

    public Calculator(double firstNumber, double secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
    }

    public Calculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.sign = "+";
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        firstNumber = scanner.nextDouble();

        System.out.println("Введите математический знак");
        sign = scanner.next();

        System.out.println("Введите второе число");
        secondNumber = scanner.nextDouble();

        scanner.close();
    }

    public String output() {
        return ("Ответ: " + this.choiceOperation());
    }

    public double choiceOperation(){
        Operation operation;
        switch(sign.charAt(0)){
            case '+':
                operation = new Plus(firstNumber, secondNumber);
                break;

            case '-':
                operation = new Minus(firstNumber, secondNumber);
                break;

            case '/':
                operation = new Divide(firstNumber, secondNumber);
                break;

            case '*':
                operation = new Multiply(firstNumber, secondNumber);
                break;

            default: System.out.println("Ошибка ввода знака операции");
                System.exit(0);
                return 0;
        }
        return operation.operationResult();
    }
}

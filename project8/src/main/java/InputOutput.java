import java.util.Scanner;

public class InputOutput {
    public InputOutput() {
    }

    public Calculator input(){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите математический знак");
        String sign = scanner.next();

        System.out.println("Введите второе число");
        double secondNumber = scanner.nextDouble();

        //Calculator calculator = new Calculator(firstNumber,secondNumber,sign);
        scanner.close();
        return calculator;
    }

    public String output(Calculator calculator) {
        return ("Ответ: " + calculator.choiceOperation());
    }
}

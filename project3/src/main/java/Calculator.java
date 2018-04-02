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

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите первое число");
        firstNumber = scanner.nextDouble();

        System.out.println("Введите математический знак");
        String sign = scanner.next();

        System.out.println("Введите второе число");
        secondNumber = scanner.nextDouble();

        scanner.close();
    }

    private void summa() {
        System.out.println(firstNumber + secondNumber);
    }
    private void subtraction() {
        System.out.println(firstNumber - secondNumber);
    }
    private void division() {
        System.out.println(firstNumber / secondNumber);
    }
    private void multiplication() {
        System.out.println(firstNumber * secondNumber);
    }

    public void choice(){
        switch(sign.charAt(0)){
            case '+': summa();
                break;

            case '-': subtraction();
                break;

            case '/': division();
                break;

            case '*': multiplication();
                break;

            default: System.out.println("Ошибка ввода знака операции");
        }
    }
}

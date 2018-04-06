import Operations.*;


public class Calculator {

    private double firstNumber;
    private double secondNumber;
    private String sign;

    public Calculator(double firstNumber, double secondNumber, String sign) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.sign = sign;
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

    public Calculator() {
        this.firstNumber = 0;
        this.secondNumber = 0;
        this.sign = "+";
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

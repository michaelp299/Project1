package Operations;

public class Divide implements Operation {
    private double firstNumber;
    private double secondNumber;

    public Divide(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double operationResult() {
        return firstNumber / secondNumber;
    }
}
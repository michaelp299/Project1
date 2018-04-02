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
        int result = 0;
        try{
            result = (int)firstNumber / (int)secondNumber;
        }
        catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!");
            System.out.println(e);
            System.exit(0);
        }
        return result;
    }
}
import org.junit.Assert;
import org.junit.Test;


public class CalculatorTests {

    @Test
    public void checkInputIncorrectSign(){
        Calculator calculator = new Calculator(5,5,"-");
        Assert.assertTrue("Неверно введен знак",
                calculator.getSign()=="+" ||
                        calculator.getSign()=="-" ||
                        calculator.getSign()=="*" ||
                        calculator.getSign()=="/");
    }

    @Test
    public void checkPlus(){
        Calculator calculator = new Calculator(5.3,5,"+");
        Assert.assertEquals("Сумма рассчитана неверно",10.3,calculator.choiceOperation(),0);
    }

    @Test
    public void checkMinus(){
        Calculator calculator = new Calculator(5,6,"-");
        Assert.assertEquals("Сумма рассчитана неверно",-1.0,calculator.choiceOperation(),0);
    }

    @Test
    public void checkDivide(){
        Calculator calculator = new Calculator(5,2,"/");
        Assert.assertEquals("Сумма рассчитана неверно",2.5,calculator.choiceOperation(),0);
    }

    @Test
    public void checkMultiply(){
        Calculator calculator = new Calculator(5,5.1,"*");
        Assert.assertEquals("Сумма рассчитана неверно",25.5,calculator.choiceOperation(),0);
    }
}

import java.util.Random;

public class RandomNumbers {

    private final int COUNT = 20;
    public int [] number;

    public RandomNumbers() {
        this.number = new int[COUNT];
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public void fillingArray(){
        Random random = new Random();
        for(int i=0; i < COUNT; i++){
            this.number[i] = random.nextInt(21) - 10;
        }
    }
    public int maxNegativeNumber (){
        int value = -11;
        int valueNumber = 0;
        for(int i=0; i < COUNT; i++){
            if(this.number[i]>value && this.number[i]<0) {
                value = this.number[i];
                valueNumber = i;
            }
        }
        return valueNumber;
    }

    public int minPositiveNumber (){
        int value = 11;
        int valueNumber = 0;
        for(int i=0; i < COUNT; i++){
            if(this.number[i]<value && this.number[i]>0) {
                value = this.number[i];
                valueNumber = i;
            }
        }
        return valueNumber;
    }

    public void arrayOutput(){
        for (int i=0; i < COUNT; i++)
            System.out.printf("%d\t",this.number[i]);
    }

    public void swap(int i, int j){
        int value;
        value = this.number[i];
        this.number[i] = this.number[j];
        this.number[j] = value;
    }
}

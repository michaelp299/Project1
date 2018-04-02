
public class Base {
    public static void main(String[] args) {

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.fillingArray();
        randomNumbers.arrayOutput();
        System.out.println("\nНомер самого большого отрицательного элемента: " + (randomNumbers.maxNegativeNumber() + 1));
        System.out.println("Номер самого маленького позитивного элемента: " + (randomNumbers.minPositiveNumber() + 1));
        randomNumbers.swap(randomNumbers.maxNegativeNumber(),randomNumbers.minPositiveNumber());
        randomNumbers.arrayOutput();
    }
}
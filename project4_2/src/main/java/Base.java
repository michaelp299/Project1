import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Present present = new Present();

        System.out.println("Введите количество сладостей в подарке");

        present.setPresent(scanner.nextInt());

        present.printPresent();

        scanner.close();
    }
}

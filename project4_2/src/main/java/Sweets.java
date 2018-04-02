import java.util.Scanner;

public class Sweets {
    public String name;
    public double weight;
    public double price;
    public String uniqueParameter;
    public Scanner scanner = new Scanner(System.in);

    public Sweets(String name, double weight, double price, String uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
    }

    public Sweets() {
        System.out.println("Введите название сладости:");
        name = scanner.next();
        System.out.println("Введите массу:");
        weight = scanner.nextInt();
        System.out.println("Введите стоимость:");
        price = scanner.nextInt();
        System.out.println("Введите уникальный параметр:");
        uniqueParameter = scanner.next();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUniqueParameter() {
        return uniqueParameter;
    }

    public void setUniqueParameter(String uniqueParameter) {
        this.uniqueParameter = uniqueParameter;
    }

    public void outputParameters(){
        System.out.println(name + "\t Масса: " + weight + "\t Цена: " + price + "\t" + uniqueParameter);
    }
}

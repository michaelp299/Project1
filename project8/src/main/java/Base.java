public class Base {
    public static void main(String[] args) {
        InputOutput inOut = new InputOutput();
        Calculator calculator = inOut.input();
        System.out.print(inOut.output(calculator));
    }
}
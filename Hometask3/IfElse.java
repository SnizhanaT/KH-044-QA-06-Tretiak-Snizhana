import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first value");
        double value1 = scanner.nextDouble();

        System.out.println("Input operation");
        String operation = scanner.next();

        System.out.println("Input second value");
        double value2 = scanner.nextDouble();

        if (operation.equals("+")) {
            System.out.println(value1 + value2);
        } else if (operation.equals("-")) {
            System.out.println(value1 - value2);
        } else if (operation.equals("*")) {
            System.out.println(value1 * value2);
        } else if (operation.equals("/")) {
            System.out.println(value1 / value2);
        } else if (operation.equals("%")) {
            System.out.println(value1 % value2);
        } else System.out.println("You have inputted an unsupported operation");

    }
}

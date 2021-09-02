import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("Where do you live, Snizhana?");
        String address = scanner.nextLine();
        System.out.println(name+"," + " " + address);


    }
}

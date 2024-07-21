import java.util.Scanner;

public class MainClass {
    public static void main (String[] Args) {
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello, " + name);
        scan.close();
    }
}


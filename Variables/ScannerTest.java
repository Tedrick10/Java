package Variables;

import java.util.*;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your birth place: ");
        String birthPlace = scanner.nextLine();

        System.out.print("Enter your salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter your favorite backend language: ");
        String favoriteBackendLanguae = scanner.nextLine();

        System.out.print("Enter your favorite frontend language: ");
        String favoriteFrontendLanguage = scanner.nextLine();

        System.out.println();
        System.out.println("Your name is " + name +".");
        System.out.println("Your birthplace is " + birthPlace + ".");
        System.out.println("Your salary is " + salary + ".");
        System.out.println("Your favorite backend language is " + favoriteBackendLanguae + ".");
        System.out.println("Your favorite frontend language is " + favoriteFrontendLanguage + ".");
        System.out.println();
        
        scanner.close();
    }
}

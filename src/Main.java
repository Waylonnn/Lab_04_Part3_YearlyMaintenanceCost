import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double winter;
        double spring;
        double fall;
        double summer;
        double total;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Maintenance Cost for each Season. \n Winter: ");
        winter = scan.nextInt();
        System.out.println("\n Spring: ");
        spring = scan.nextInt();
        System.out.println("\n Summer: ");
        summer = scan.nextInt();
        System.out.println("\n Fall: ");
        fall = scan.nextInt();

        total = winter + spring + summer + fall;

        System.out.println("Total Yearly Maintenance Cost: $" + total);
    }
}
import java.util.Scanner;

public class TotalLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how may chickens, Goats, and Cows");
        System.out.print("How many Chickens? ");
        Integer chickens = scanner.nextInt();

        System.out.print("How many Goats? ");
        Integer goats = scanner.nextInt();

        System.out.print("How many Cows? ");
        Integer cows = scanner.nextInt();

        Integer chickensleg = chickens * 2;
        Integer goatsleg = goats * 4;
        Integer cowsleg = cows * 4;
        Integer totallegs = chickensleg + goatsleg + cowsleg;
        System.out.println("Total number of legs: " + totallegs);
    }
}
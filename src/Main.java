import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        // Create Variables
        double pear, apple, tomato, banana, eggplant, result;

        // Create Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Manavımıza Hoşgeldiniz!\n Kaç Kilo Armut Aldınız?: ");
        pear = scanner.nextDouble();
        System.out.println("Kaç Kilo Elma Aldınız?: ");
        apple = scanner.nextDouble();
        System.out.println("Kaç Kilo Domates Aldınız?: ");
        tomato = scanner.nextDouble();
        System.out.println("Kaç Kilo Muz Aldınız?: ");
        banana = scanner.nextDouble();
        System.out.println("Kaç Kilo Patlıcan Aldınız?: ");
        eggplant = scanner.nextDouble();

        // Calculations
        result = (pear * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (eggplant * 5.00);
        System.out.println("Toplam Tutar: " + df.format(result) + " TL");

    }
}
import java.util.Scanner;

public class CurrencyChange {
    public static void main(String[] args) {
        final double RUBLES_PER_TRY = 4.03;
        double tryAmount, resultRubles;
        System.out.println("Enter amount of liras");

        Scanner scanner = new Scanner(System.in);
        tryAmount = scanner.nextDouble();
        resultRubles = RUBLES_PER_TRY * tryAmount;

        System.out.println("In rubles: " + resultRubles);
    }
}
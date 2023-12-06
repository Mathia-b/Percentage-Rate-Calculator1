import javax.xml.transform.SourceLocator;
import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Old Rate:$");
        String oldRate = scanner.nextLine();

        System.out.print("Percent Discounted:");
        String percent = scanner.nextLine();

        Float discount = Float.parseFloat(percent) * 0.01F * Float.parseFloat(oldRate);

        Float newRate = Float.parseFloat(oldRate) - discount;
        String newRateFormatted = NumberFormat.getCurrencyInstance().format(newRate);

        System.out.println("New Rate:" + newRateFormatted);

    }
}

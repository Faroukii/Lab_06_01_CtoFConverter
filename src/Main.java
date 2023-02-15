import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fahrenheit = 0;
        String trash = "";
        System.out.println("Please enter temperature in Fahrenheit: ");

        if (in.hasNextDouble())
        {
            fahrenheit = in.nextDouble();
            double celsius = (fahrenheit * 1.8)+32;
            System.out.println("The temperature in celsius is: " + celsius);
        }
        else
        {
        trash = in.nextLine();
            System.out.println("Please enter correct value: " + trash);
        }
    }
}
import java.util.Scanner;

public class Fah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int mySalay = 2000;
        
        System.out.print("Enter Fahrenheit drgree");
        float fahrenheit = scanner.nextFloat();

        float Scanner01 = (fahrenheit -32 )*5/9;

double roundedCalsius = Math.round(Scanner01 *100.0)/100.0;
System.out.print(fahrenheit + "fahrenheit is equal to "+roundedCalsius);
    }
}

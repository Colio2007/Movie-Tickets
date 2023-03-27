//Cole Hopper 
//this program will ask your age and if you have a coupon or not in witch case it will calculate your price and tell you the price

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main (String [] args) {
        // Create the input scanner

        
        DecimalFormat formatter = new DecimalFormat(".00");
        
        Scanner input = new Scanner(System.in);

        double price = 14.50;
        
        System.err.print("How old are you? ");
        int age = input.nextInt();

        // Ask the user if they have a coupon
        
        System.err.print("Do you have a coupon? [true/false]");
        Boolean coupon = input.nextBoolean();
        
        // Print the cost of a movie ticket

        if (coupon ) {
            price = (price - 2);
        }
        if (age <= 12 || age >= 65){
            price = (price - 3);
        }
        
        System.out.print("your price is " + formatter.format(price) + "$.");
    } 
}
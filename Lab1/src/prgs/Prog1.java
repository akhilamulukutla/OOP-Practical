package prgs;

import java.util.Scanner;

public class Prog1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter bill amount: ");
        double b = sc.nextDouble();

        System.out.print("Enter GST percentage: ");
        double g = sc.nextDouble();

        System.out.print("Enter maintenance percentage: ");
        double m = sc.nextDouble();

       
        double gst = b * g / 100;
        double mn = b * m / 100;
        double total = b + gst + mn;

        double discount;
        if (b > 1000) {
            discount = total * 0.10;
        } else {
            discount = total * 0.05;
        }

        double finalAmount = total - discount;

       
        System.out.println("\n--- Bill Breakdown ---");
        System.out.println("Base Amount       : " + b);
        System.out.println("GST (" + g + "%)       : " + gst);
        System.out.println("Maintenance (" + m + "%): " + mn);
        System.out.println("Total Before Discount: " + total);
        System.out.println("Discount Applied     : " + discount);
        System.out.println("Final Amount to Pay  : " + finalAmount);
    }
}


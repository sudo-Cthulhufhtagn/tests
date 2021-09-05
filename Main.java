package com.company;

import java.util.Scanner;
import java.text.*;


public class Main {

    
    public static double expression_value(double x, int k, Integer num){
        double sum = 1.;
        double term = 1;
        for (int i = 1; ; i++){
            term = term / i * x;

            sum += term;
            if (Math.abs(term) < Math.pow(10, -k)) {
                num = i;
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try
        {
            double x = 1;
            int k = 8;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter x: ");
            x = scanner.nextDouble();
            System.out.println("Enter k: ");
            k = scanner.nextInt();

            System.out.println(x + "\tAND\t" + k);

            Integer num = 0;

            double result = expression_value(x, k, num);



            int accuracy = 0;
            System.out.println("Enter precision: ");
            accuracy = scanner.nextInt();
            NumberFormat formatter = NumberFormat.getNumberInstance();
            formatter.setMaximumFractionDigits(accuracy);

            System.out.print(formatter.format(result));
            System.out.println("\nCalculation took " + num + " iterations");
            System.out.println("\nJava value: " + formatter.format(Math.exp(x)));
            scanner.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}

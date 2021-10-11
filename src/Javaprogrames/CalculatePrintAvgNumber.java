package Javaprogrames;

import java.util.Scanner;

public class CalculatePrintAvgNumber {

    /* The three number as input to calculate and print the avarage of the numbers*/
    public static void main(String[] args) {

         //Scanner in = new Scanner(System.in);
         CalculatePrintAvgNumber obj = new CalculatePrintAvgNumber();
        obj.avarage();

    }

        public void avarage() {
       System.out.print("Input first number:");
        Scanner in =  new Scanner(System.in);
        float n1 = in.nextInt();

        System.out.print("Input second number:");
        float n2 = in.nextInt();

        System.out.print("Input third number:");
        float n3 = in.nextInt();

        System.out.println("Avarage of three numbers is" + (n1 + n2 + n3) / 3);


    }


}

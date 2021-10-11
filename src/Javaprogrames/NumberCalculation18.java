    package Javaprogrames;
    import java.util.Scanner;

    public class NumberCalculation18 {
    public static void main(String[] args) {
        NumberCalculation18 adding = new NumberCalculation18();
        adding.sum();

    }

    public void sum() {
        Scanner in = new Scanner(System.in);


        System.out.println("Input first number");
        int n1 = in.nextInt();

       // System.out.println("Input second number:");/

           // Scanner in = new Scanner(System.in);
            //System.out.println("Input first number :");
           // int n1 = in.next

            System.out.println("Input second number :");
            int n2 = in.nextInt();
            System.out.println(n1 +  " + " + n2 + " = " + (n1 + n2));

            System.out.println(n1 + " - " + n2 + " = " + (n1 + n2));
            System.out.println(n1 + " * " + n2 + " - " + (n1 + n2));
            System.out.println(n1 + "/ " + n2 + " = " + (n1 + n2));
            System.out.println(n1 + "mod" + n2 + " = " + (n1 % n2));

        }


    }




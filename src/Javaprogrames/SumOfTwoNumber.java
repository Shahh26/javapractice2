    package Javaprogrames;

    import java.util.Scanner;

    public class SumOfTwoNumber {
    public static void main(String[] args) {
        SumOfTwoNumber obj = new SumOfTwoNumber();
        obj.Sum();

    }
        public void Sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number:");
        int n1 = in.nextInt();

        System.out.println("Input first number:");
        int n2 = in.nextInt();

        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));

        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));

        System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));

        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));

        System.out.println(n1 + " mod " + n2 + " = " + (n1 % n2));


        }




}

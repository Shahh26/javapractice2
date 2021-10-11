    package Javaprogrames;

    import java.util.Scanner;


    public class TemperatureValueConveter7 {

    public static void main(String[] args) {
        Scanner  input =new Scanner(System.in);
        System.out.println("Input a degree in ferhenheat:");
        double ferhenheat =input.nextDouble();

        double celcius = ((5 * (ferhenheat-32.0)) / 9.0);
        System.out.println(ferhenheat +"degree ferhenheat is equal to" +celcius +"in celcious ");


    }

}

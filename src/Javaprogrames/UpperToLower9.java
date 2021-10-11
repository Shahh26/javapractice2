    package Javaprogrames;
    import java.util.Locale;
    import java.util.Scanner;
    public class UpperToLower9 {
        private static Scanner sc;

        public static void main(String[] args) {

            UpperToLower9 obj = new UpperToLower9();
            obj.upper();

        }
        public void  upper() {
            String UpperStr;
            sc = new Scanner(System.in);
            Scanner input = new Scanner(System.in);
            System.out.println("\n Enter Uppercase String=");
            UpperStr = sc.nextLine();
            String Upperstr1 = UpperStr.toLowerCase();
            System.out.println("\n The Lowercase String =" +Upperstr1);
        }

    }













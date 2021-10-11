     package Javaprogrames;
     import java. util.Locale;
      // A java programe to convert a given string to lowercase

     public class UpperToLowerCase19 {
     public static void main(String[] args){
         UpperToLowerCase19 obj = new UpperToLowerCase19();
         obj.convert();

     }

     public void convert() {
         String s1 = new String("THE QUICK BROWN FOX JUNMP OVER THE LAZY DOG.");
         // convert  to lowercase
         System.out.println(s1.toLowerCase(Locale.ROOT));
     }

 }



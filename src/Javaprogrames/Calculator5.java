package Javaprogrames;
/* Java programe for calculator   with addition,Subtraction, Multiplication, and Division */


public class Calculator5{

    public static void main(String[] args) {
    Calculator5 obj = new Calculator5();
    obj.addition(26,10);//36
        obj.sub(20, 7);//13
        multiint(5, 5 );//25
       devide ( 30,  5);//6


    }

public void addition(int a, int b){
        //Scanner input = new Scanner(System,in);
    System.out.println(a + b);

}
public void sub(int c, int d){
    System.out.println(c -d);

}

public static void multiint(int e, int f){
    System.out.println(e * f);

}
public static void devide( int h , int i){
    System.out.println(h / i);

}

}

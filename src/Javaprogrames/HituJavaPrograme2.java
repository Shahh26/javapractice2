package Javaprogrames;

import java.sql.SQLOutput;

public class HituJavaPrograme2 {
    static int h = 26;// static variable
    static int k = 10; // static variable

    public static void main(String [] args) {
        //System.out.printlan(h);
        System.out.println(HituJavaPrograme2.h);//26
        //System.out.pruintln(k);
        System.out.println(HituJavaPrograme2.k);//10
        myMethod();

    }

    public static void myMethod() {
        System.out.println(h);//26
        System.out.println(HituJavaPrograme2.h);//access with class name
        System.out.println(k);//10
        System.out.println(HituJavaPrograme2.k);//access with class name

    }



    }




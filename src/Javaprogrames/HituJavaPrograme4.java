package Javaprogrames;

public class HituJavaPrograme4 {

    int h = 26; // Instance Variable
    int k = 10; // Second Instance variable
    static int s = 11;// Static  variable
    static int p = 24;// second stativ variable

    public static void main(String[] args) {
        // call both instance  and static variable
        Javaprogrames.HituJavaPrograme4 obj = new Javaprogrames.HituJavaPrograme4();
        Javaprogrames.HituJavaPrograme4 obj1 = new Javaprogrames.HituJavaPrograme4();
        System.out.println(obj.h);// 26
        System.out.println(obj.k);//10
        abc(); //
    }

        public void test() {
            // instance area
            System.out.println(h);
            System.out.println(k);
        }
        public static void abc() {
            //static area
            System.out.println(s);
            System.out.println(p);


        }

    }




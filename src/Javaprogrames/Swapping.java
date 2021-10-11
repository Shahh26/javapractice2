package Javaprogrames;

public class Swapping {
    public static void main(String[] args) {
        Swapping  obj = new Swapping();
        obj.swap();

    }
    public void swap(){
        int h,k, temp;
        h = 26;
        k = 24;
        System.out.println("Before swapping : h, k = "+h+", " + + k);//26,24
        temp= h;
        h = k;
        k = temp;
        System.out.println("After swapping : h, k = "+h+", " + + k);//26,24

    }
}

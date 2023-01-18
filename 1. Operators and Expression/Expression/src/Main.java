import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Case1
        /*float base, height, area;
        System.out.println("Enter Base and Height ");
        Scanner sc = new Scanner(System.in);
        base = sc.nextFloat();
        height = sc.nextFloat();
        area = base * height / 2;
        System.out.println("Area of a triangle is: " + area);
        */

        //Case2
        int a, b, c;
        float s;
        double area;
        System.out.println("Enter 3 sides of a triangle");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)/2f;
        area = Math.sqrt(s * ((s-a) * (s-b) * (s-c)));
        System.out.println("Value of s is: " + s);
        System.out.println("Area is: " + area);
    }
}
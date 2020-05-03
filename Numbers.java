import java.util.Scanner;

public class Numbers {

    public int add (int a, int b){
        int c = a + b;
        return c;
    }

    public int subtract (int a, int b){
        int c = a -b;
        return c;
    }

    public int multiply (int a, int b){
    int c = a*b;
    return c;
    }

    public int divide (int a, int b){
        int c = a/b;
        return c;
    }

    public int remainder (int a, int b){
        int c = a%b;
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first value:");
        int a = scanner.nextInt();
        System.out.println("Please enter the second value");
        int b = scanner.nextInt();

        Numbers number = new Numbers();
        int c = number.add(a,b);
        int d = number.subtract(a,b);
        int e = number.multiply(a,b);
        int f = number.divide(a,b);
        int g = number.remainder(a,b);

        System.out.println("Addition of the two numbers is "+c);
        System.out.println("Subtraction of the two numbers is "+d);
        System.out.println("Multiplication of the two numbers is "+e);
        System.out.println("Division of the two numbers to the nearest integer is "+f);
        System.out.println("The modulus of the two numbers is "+g);


    }


    }

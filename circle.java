import java.util.Scanner;

public class circle {

    public double area (double radius){
        double area = radius*radius*Math.PI;
        return area;
    }

    public double circumference (double radius){
        double circumference = radius*2*Math.PI;
        return circumference;
    }

    public static void main(String[] args) {
        circle circle = new circle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radius of the circle.");
        double radius = scanner.nextDouble();
        double area = circle.area(radius);
        double circumference = circle.circumference(radius);

        System.out.println("The area of the circle is " + area);
        System.out.println("The circumference of the circle is " + circumference);
    }


}

package November;

import java.util.Scanner;

public class CircleArea {

    public static final double PI = 3.1416;
    public double area = 0;
    public int r;

    public CircleArea(int r){
        this.r = r ;
    }

    public double areaOfCircle(){
        area = PI * r * r ;
        return area;
    }

    public void display(){
        System.out.println("Radius of Circle is : " + area);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius of circle :");
        int r = sc.nextInt();

        CircleArea ca = new CircleArea(r);

        ca.areaOfCircle();
        ca.display();

        sc.close();
    }
}

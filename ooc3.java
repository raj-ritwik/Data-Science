import java.util.Scanner;

class Shape{
	double calculateArea(double base,double height)
	{
		double area = 0;
		return area;
	}
}
class Triangle extends Shape{
	double calculateArea(double base,double height) {
		double area = 0.5*base*height;
		return area;
	}
}
class Square extends Shape{
	double calculateArea(double base,double height) {
		double area = base*base;
		return area;
	}
}
class Rectangle extends Shape{
	double calculateArea(double base,double height) {
		double area = base*height;
		return area;
	}
}
public class ooc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base:");
		double base=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the height:");
		double height=sc.nextInt();
		sc.nextLine();
		
		Shape T = new Triangle();
		Shape S = new Square();
		Shape R = new Rectangle();
		
		System.out.println("Area of Triangle:"+T.calculateArea(base, height));
		System.out.println("Area of Square:"+S.calculateArea(base, height));
		System.out.println("Area of Rectangle:"+R.calculateArea(base, height));

	}

}

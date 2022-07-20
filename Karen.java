
import java.util.Scanner; 

public class Karen { 
	
	public static void main(String[] args) { 
		int salary=0,shifts=0; 
		double savings=0; 
		Scanner in=new Scanner(System.in); 
		salary = in.nextInt(); 
		shifts = in.nextInt(); 
		
			savings = (salary*0.5)+(salary*0.02*shifts); 
		System.out.printf ("%.0f",savings); } } 
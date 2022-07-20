import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0;
		double bonus=0;
		
		Scanner sc=new Scanner(System.in); 
		salary = sc.nextInt(); 
		
		if(salary > 20000) 
			bonus = 0.17 * salary +1500; 
		else if(salary > 15000) 
			bonus = 0.15 * salary + 1200; 
		else if(salary>10000) 
			bonus = 0.12 * salary + 1000;
		else { 
			bonus = 0.08 * salary + 500; 
			 } 
		System.out.printf ("%.0f",bonus);
		}

	}



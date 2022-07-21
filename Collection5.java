import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li1=new ArrayList<>();
		List<Integer> li2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter 5 elements of 1st list : ");
		for(int i=0;i<5;i++) {
			n=sc.nextInt();
			li1.add(n);
		}
		System.out.println("Enter 5 elements of 2nd list : ");
		for(int i=0;i<5;i++) {
			n=sc.nextInt();
			li2.add(n);
		}
		li1.addAll(li2);
		Collections.sort(li1);
		List<Integer> li3=new ArrayList<>();
		li3.add(li1.get(2));
		li3.add(li1.get(6));
		li3.add(li1.get(8));
		System.out.println(li3);
		

	}

}

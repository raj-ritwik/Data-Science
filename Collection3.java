import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		

		System.out.print("Enter the value of n: ");

		int n=sc.nextInt();

		List<String> obj=new ArrayList<>();

		String str="";

		for(int i=0;i<n;i++)

		{

		str=sc.next();

		obj.add(str);

		}

		convertToStringArray(obj);
	}

		private static void convertToStringArray(List<String> obj)
		{

		Collections.sort(obj);

		String arr[]=new String[obj.size()]; 
		for (int i=0;i<obj.size();i++)

		{

		arr[i]=obj.get(1);

		}

		System.out.println(""); System.out.println("Sorted array : ");

		for(String str:arr) {
			System.out.println(str);

	}
}

}

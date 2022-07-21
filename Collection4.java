import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Collection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the value m(fruit names) for no of fruits: "); 
		int m=sc.nextInt(); 
		List<String> obj1=new ArrayList<>(); 
		String str=""; 
		for(int i=0;i<m;i++) {

		str=sc.next(); 
		obj1.add(str);

		}

		System.out.print ("Enter the value n(fruit names) for no of fruits : "); 
		int n=sc.nextInt(); 
		List<String> obj2=new ArrayList<>(); 
		for (int i=0;i<n;i++)

		{

		str=sc.next(); obj2.add(str);

		}

		fruitSelector(obj1, obj2); 
		sc.close();

		}

	public static void fruitSelector(List<String> obj1, List<String> obj2) {
		// TODO Auto-generated method stub
		List<String> obj3=obj1.stream().filter(s1-> (s1.endsWith("a") || s1.endsWith("e"))).collect (Collectors.toList()); 
		List<String> obj4=obj2.stream().filter(s2 ->(s2.startsWith("")||s2.startsWith("A"))).collect (Collectors.toList());

		obj2.removeAll(obj4);

		List <String> obj=new ArrayList<>();

		obj.addAll(obj1);

		obj.addAll(obj2);

		Collections.sort(obj);

		if(obj.isEmpty())

		{

		System.out.println(""); 
		System.out.println("No fruits found");

		}

		else {

		String arr[]=new String[obj.size()]; 
		for (int i=0;i<obj.size();i++) {

		arr[i]=obj.get(i);

		}

		System.out.println("");

		for(String str:arr) {
			System.out.println(str);
		}
		
	}

	}

}



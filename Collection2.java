import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pairs you want to enter: ");
		int n = sc.nextInt();
		int key=0;
		String value="";
		
		System.out.println("Enter the key value pair sequentially: ");
		for(int i=0;i<n;i++) {
			key=sc.nextInt();
			value=sc.next();
			map.put(key, value);
		}
		Collection2 cl2=new Collection2();
		System.out.println(cl2.getMaxKeyValue(map));
		sc.close();

	}

	static String getMaxKeyValue(Map<Integer, String> map) {
		// TODO Auto-generated method stub
		int max=(Collections.max(map.keySet()));
		
		return (map.get(max));
	}

}

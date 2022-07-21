import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of pairs you want to enter: ");
		int n = sc.nextInt();
		String key="";
		String value="";
		Collection1 cl=new Collection1();
		System.out.println("Enter the key value pair sequentially: ");
		for(int i=0;i<n;i++) {
			key=sc.next();
			value=sc.next();
			map.put(key, value);
		}
		System.out.println("Enter the state for it's capital: ");
		String st=sc.next();
		System.out.println((cl.getCapital(map,st).toLowerCase())+"$"+st.toLowerCase());

	}

	static String getCapital(Map<String, String> map, String st) {
		// TODO Auto-generated method stub
		return (map.get(st));
	}

}

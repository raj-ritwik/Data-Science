import java.util.Scanner;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int r=sc.nextInt();
		String[] arr=new String[10];
		String str="";
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<r;i++) {
			arr[i]=sc.next();
		}
		for(int j =0;j<r;j++) {
			str+=arr[j].charAt(arr[j].length()-1);
		}
		System.out.println("New String: "+str);
		sc.close();

	}

}

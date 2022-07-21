import java.util.Scanner;

public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int len=sc.nextInt();
		String[] arr=new String[10];
		
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<len;i++) {
			arr[i]=sc.next();
		}
		int n,count=0;
		System.out.println("Enter the value of n: ");
		n=sc.nextInt();
		for(int i=0;i<len;i++) {
			if(arr[i].length()==n) {
				count+=1;
			}
		}
		System.out.println("No. of elements: "+count);
		sc.close();

	}

}

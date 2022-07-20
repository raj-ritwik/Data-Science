import java.util.Scanner;

class Product{
	int productCode;
	String productName;
	double price;
	public void getProduct() {
		System.out.println("productid:"+this.productCode+"productname:"+this.productName+"price:"+this.price);
	}
	public void setProduct(int productCode,String productName,double price)
	{
		this.productCode=productCode;
		this.productName=productName;
		this.price=price;
	}
	
}
public class OOC5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] obj=new Product[100];
		while(true)
		{
			System.out.println("Add - 1 | Display - 2 | Exit - 3");
			Scanner sc=new Scanner(System.in);
			int  choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Product Code: ");
				int pcode=sc.nextInt();
				sc.nextLine();
				System.out.println("Product Name : ");
				String pname = sc.nextLine();
				System.out.println("Product Price : ");
				double pprice = sc.nextDouble();
				
				obj[pcode] = new Product();
				obj[pcode].setProduct(pcode, pname, pprice);
				
				break;
				
			case 2:
				System.out.println("Enter the product Id or Code.");
				int id=sc.nextInt();
				
				obj[id].getProduct();
				break;
			
			case 3:
				System.exit(0);
				break;
				
			default:
				System.out.println("Select the above choices");
			}
		}

	}

}

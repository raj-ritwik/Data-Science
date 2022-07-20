import java.util.Scanner;

class Associate{
	int associateId;
	String associateName;
	String workStatus;
	public int getAssociateId() {
		return associateId;
	}
	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}
	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getWorkStatus() {
		return workStatus;
	}
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
	public void trackAssociateStatus() {
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the no. of days:");
		
		int no=st.nextInt();
		if(no<=20) {
			workStatus="Assosciate (Core Skills)";
		}
		else if((no>20)&&(no<=40)) {
			workStatus="Assosciate (Advanced Modules)";
		}
		else if((no>40)&&(no<=60)) {
			workStatus="Assosciate (Project Phase)";
		}
		else {
			workStatus="Deployed in project";
		st.close();
		}
	}
}
public class OOC4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Associate a = new Associate();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your id:");
		int associateId=s.nextInt();
		a.setAssociateId(associateId);
		System.out.println("Enetr your name:");
		String associateName=s.next();
		a.setAssociateName(associateName);
		a.trackAssociateStatus();
		System.out.println("Employee id:"+(a.getAssociateId()));
		System.out.println("Employee Name:"+(a.getAssociateName()));
		System.out.println("Work Status:"+(a.getWorkStatus()));
		

	}

}

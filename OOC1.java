
class Student {
	protected String name;
	protected int id;
	protected int age;
	protected int grade;
	protected String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Student(){
		setName("");
		setId(0);
		setAge(0);
		setGrade(0);
		setAddress("");
	}
	
	public Student(String name, int id, int age, int grade, String address) {
		this.name=name;
		this.id=id;
		this.age=age;
		this.grade=grade;
		this.address=address;
	}
	
	public void display() {
		
		System.out.println("Name:"+getName());
		System.out.println("id:"+getId());
		System.out.println("Age:"+getAge());
		System.out.println("Grade:"+getGrade());
		System.out.println("Address:"+getAddress());
	}
	boolean isPassed(int grade) {
		if(grade>50) {
			return true;
		}
			else
				return false;
		
	}
	
	class UGStudent extends Student
	{
		private String degree;
		private String stream;
		public String getDegree() {
			return degree;
		}
		public void setDegree(String degree) {
			this.degree = degree;
		}
		public String getStream() {
			return stream;
		}
		public void setStream(String stream) {
			this.stream = stream;
		}
		
		UGStudent()
		{
			super();
			setDegree("");
			setStream("");
		}
		public UGStudent(String name, int id, int age, int grade, String address, String degree, String stream)
		{
			super(name,id,age,grade,address);
			this.degree=degree;
			this.stream=stream;
		}
		public void display() {
		
			System.out.println("Name:"+getName());
			System.out.println("id:"+getId());
			System.out.println("Age:"+getAge());
			System.out.println("Grade:"+getGrade());
			System.out.println("Address:"+getAddress());
			System.out.println("Degree:"+getDegree());
			System.out.println("Stream:"+getStream());
		}
		boolean isPassed() {
			if(grade>70) {
				return true;
			}
				else
					return false;
			
		}
		
		
	}
	class PGStudent extends Student{
		private String specialization;
		private int paper;
		public String getSpecialization() {
			return specialization;
		}
		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}
		public int getPaper() {
			return paper;
		}
		public void setPaper(int paper) {
			this.paper = paper;
		}
		PGStudent()
		{
			
		}
		public PGStudent(String name, int id, int age, int grade, String address, String specialization, int paper)
		{
			super(name,id,age,grade,address);
			this.specialization=specialization;
			this.paper=paper;
		}
		public void display() {
			
			System.out.println("Name:"+getName());
			System.out.println("id:"+getId());
			System.out.println("Age:"+getAge());
			System.out.println("Grade:"+getGrade());
			System.out.println("Address:"+getAddress());
			System.out.println("Specialization:"+getSpecialization());
			System.out.println("Paper:"+getPaper());
		}
		boolean isPassed() {
			if((grade>70)&&(paper>=2)) {
				return true;
			}
				else
					return false;
			
		}
	
		
	}
public class OOC1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.display();
		System.out.println("Passed:"+s.isPassed(60));
		
		Student.UGStudent m = s.new UGStudent("Ritwik Raj",003,21,78,"Jharkhand","B.Tech","IT");
		m.display();
		
		Student.PGStudent n = s.new PGStudent("Raj",013,24,88,"Jk","B.Tech",5);
		n.display();
		
		
}

}}

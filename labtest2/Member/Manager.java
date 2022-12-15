package Member;

public class Manager extends membermain{
	String department;
	
	Manager(String name,int age,int pnum, String address,int salary,String department){
		super(name,age,pnum,address,salary);
		this.department=department;
	}
	public void print() {
		super.print();
		System.out.println(department);
	}

}

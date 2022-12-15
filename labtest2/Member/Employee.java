package Member;

public class Employee extends membermain{
	String specialization;

	Employee(String name,int age,int pnum, String address,int salary,String specialization){
		super(name,age,pnum,address,salary);
		this.specialization=specialization;
	}
	public void print(){
		super.print();
		System.out.println(specialization);
	}

}

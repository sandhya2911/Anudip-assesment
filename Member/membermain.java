package Member;

public class membermain{
	private String name;
	private int age;
	private int pnum;
	private String address;
	private int salary;
	
	membermain(String name, int age, int pnum, String address, int salary){
		this.address=address;
		this.age=age;
		this.name=name;
		this.pnum=pnum;
		this.salary=salary;
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(pnum);
		System.out.println(address);
		System.out.println(salary);
	}

}

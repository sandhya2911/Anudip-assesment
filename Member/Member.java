package Member;

public class Member{
	public static void main(String[] args) {
		Employee em=new Employee("Sandhya",23,56389623,"Delhi",25000,"Software Engg");
		Manager mn=new Manager("Sandhya",25,34567856,"Bihar",30000,"Computer Software");
		em.print();
		mn.print();
	}

}

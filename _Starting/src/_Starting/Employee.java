package _Starting;

public final class Employee extends Person {
	private String company;
	
	public Employee(String name,String surname, String company){
		super(name,surname);
		this.company = company;
	}
	
	public void displayInfo(){
		super.displayInfo();
		System.out.println("Company\t" + company);
	}
}

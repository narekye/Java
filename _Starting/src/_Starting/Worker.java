package _Starting;

public class Worker extends Human {
	public Worker(int heigth, int age, String bank) {
		super(heigth, age);
		this.bank = bank;
	}

	private String bank;
	@Override
	public void displayInfo() {
		System.out.printf("Age: %d\t Heigth: %d\t Bank%d\t", super.getAge(), super.getHeigth(), this.bank);
	}

}

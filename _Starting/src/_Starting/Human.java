package _Starting;

public abstract class Human {
	private int heigth;
	private int age;

	public int getAge() {
		return age;
	}

	public int getHeigth() {
		return heigth;
	}

	public Human(int heigth, int age) {
		this.age = age;
		this.heigth = heigth;
	}
	public abstract void displayInfo();
}

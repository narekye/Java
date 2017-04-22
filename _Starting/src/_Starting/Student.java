package _Starting;

public class Student {
	private String _name;
	private String _surname;
	private int _age;
	
	public Student(String _name, String _surname, int _age) {
		this._name = _name;
		this._surname = _surname;
		this._age = _age;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_surname() {
		return _surname;
	}

	public void set_surname(String _surname) {
		this._surname = _surname;
	}

	public int get_age() {
		return _age;
	}

	public void set_age(int _age) {
		this._age = _age;
	}
	
	@Override
	public String toString() {
		return _name + "\t" + _surname + "\t" + _age;
	}
	
}

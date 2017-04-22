package _Starting;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		Student st = new Student("John", "Smith", 18);
		Calculate(st);
		System.out.println(st);
	}

	public static void Calculate(Student st) {
		st.set_age(23);
	}
}

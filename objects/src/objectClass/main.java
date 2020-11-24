package objectClass;

public class main {

	public static void main(String[] args) {
		Student s1 = new Student("Ethan", 7, 99, 'M');
		
		System.out.println(s1.name);
		
		Rect r1 = new Rect(10, 10, 'B');
		
		r1.drawRect();
	}

}

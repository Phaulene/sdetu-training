package OOP;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
}

public class Demo {
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Pao";
		person1.email = "pao@gmail.com";
		person1.phone = "123456789";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		/* String name = "Pao";
		String email = "pao@gmail.com";
		String phone = "123456789";
		
		walking(name);
		System.out.println(name + " is eating."); 
		*/
	}
}

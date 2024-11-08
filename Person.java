package Programs;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		Person p = new Person("Suba", 20);
		System.out.println("Name of the person : "+p.getName());
		System.out.println("Age of the person : "+p.getAge());
		
	}
}

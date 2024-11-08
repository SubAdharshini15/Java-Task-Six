package Programs;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee(int id, String fname, String lname, int salary) {
		this.id = id;
		this.firstName = fname;
		this.lastName = lname;
		this.salary = salary;
	}

	public int getID() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return getFirstName() + " " + getLastName();
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualSalary() {
		return salary * 12;
	}

	public int raiseSalary(int percent) {
		salary = salary + (salary * percent / 100);
		return salary;
	}
	public String toString() {
		return "Employee[id : " + id + ",name = " + firstName + " " + lastName + ",Salary = " + salary + "]";
	}
	public static void main(String[] args) {
		Employee e = new Employee(19133, "Suba","Dharshini",10000);
		System.out.println("Employee Details : " +e.toString());
		System.out.println("====================================");
		System.out.println("Annual Salary : "+e.getAnnualSalary());
		System.out.println("====================================");
		e.raiseSalary(10);
		System.out.println("Salary after raise : "+e.toString());
	}
}

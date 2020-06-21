package javaByPcPkg;

public class Employee {
	String name;
	int salary;
	
	void set(String s1, int i){
		name = s1;
		salary = i;
	}
	
	void show(){
		System.out.println("Name of employee - "+name);
		System.out.println("Salary of employee - "+salary);
	}
	
	public static void main(String[] s){
		Employee e = new Employee();
		e.set("Praver", 10000);
		e.show();
		Employee e2 = new Employee();
		e2.set("Prince", 20000);
		e2.show();
	}
}

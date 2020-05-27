package javaByPcPkg;

public class Typecast2 {
	//All the floating literals are treated as double

	public static void show(double i){
		System.out.println("I am double "+i);
	}
	
	public static void show(float i){
		System.out.println("I am float "+i);
	}
	
	public static void main(String[] args) {
		show(2.2);
	}

}

package javaByPcPkg;

//All the integral literals are treated as int
public class Typecast1 {

	public static void show(int i){
		System.out.println("I am int "+i);
	}
	
	public static void show(long i){
		System.out.println("I am long "+i);
	}
	
	public static void show(byte i){
		System.out.println("I am byte "+i);
	}
	
	public static void show(short i){
		System.out.println("I am short "+i);
	}
	
	public static void main(String[] args) {
		show(10);
		
		/*//Calculations are done in literals not as some data-types
		byte a = 10, b = 20;
		byte c = (byte)(a + b);*/
	}

}

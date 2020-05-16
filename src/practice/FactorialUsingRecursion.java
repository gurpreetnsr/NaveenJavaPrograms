package practice;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int fact = multiply(7);
		System.out.println(fact);
	}
	
	public static int multiply(int num) {
		if(num==0)
			return 1;
		else
			return num * multiply(num-1);
	}

}

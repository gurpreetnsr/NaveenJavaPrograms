package practice;

public class ArmstringNumber {

	public static void main(String[] args) {
		
		int num = 1;
		int numberToCheck = num;
		double actualNum=0; 
		
		while(num !=0)
		{
			int rem = num % 10;
			actualNum = actualNum + Math.pow(rem, 3);
			num = num/10;
		}
		
		if(actualNum == numberToCheck)
		{
			System.out.println(actualNum + " is Armstrong number");
		}
		else
		{
			System.out.println(actualNum + " is NOT Armstrong  number");

		}

	}

}

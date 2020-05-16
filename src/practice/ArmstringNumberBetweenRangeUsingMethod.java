package practice;

public class ArmstringNumberBetweenRangeUsingMethod {

	public static void main(String[] args) {
		checkArmstrongNumber(0, 400);
		
	}
	
	public static void checkArmstrongNumber(int start, int end) {
		int startNum = start;
		int endNum = end;

		while (startNum <=endNum) {
			int num = startNum;
			int numberToCheck = num;
			double actualNum = 0;

			while (num != 0) {
				int rem = num % 10;
				actualNum = actualNum + Math.pow(rem, 3);
				num = num / 10;
			}

			if(actualNum == numberToCheck)
				System.out.println(numberToCheck + " is Armstrong number");
			startNum++;
		}
		
	}
	

}

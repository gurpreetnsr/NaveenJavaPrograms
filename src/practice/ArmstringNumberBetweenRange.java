package practice;

public class ArmstringNumberBetweenRange {

	public static void main(String[] args) {

		int startNum = 150;
		int endNum = 400;

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

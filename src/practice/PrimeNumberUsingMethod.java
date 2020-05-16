package practice;

public class PrimeNumberUsingMethod {

	public static void main(String[] args) {

		checkPrimeNumbersBetween(20, 50);

	}
	
	public static void checkPrimeNumbersBetween(int startNum, int endNum)
	{
		int startRange =startNum;
		int endRange = endNum;
		while(startRange < endRange )
		{
			boolean flag =false;
			for(int i = 2; i <=startRange/2; i++)
			{
				if(startRange%i ==0)
				{
					flag =true;
					break;
				}
			}
			if(!flag)
				System.out.println(startRange + " is a prime number");
			startRange++;
		}
	}

}

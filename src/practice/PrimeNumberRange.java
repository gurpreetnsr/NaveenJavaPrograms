package practice;

public class PrimeNumberRange {

	public static void main(String[] args) {
		int startRange =20;
		int endRange = 50;
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

package javademo;

public class TryCatchExplanation {

	public static void main(String[] args) {
		
		try
		{
		int[] numers = { 1, 2, 3, 4, 5 };
		System.out.println(numers[8]);
		}
		
		catch(Exception e)
		{
			System.out.println("Wrong code in Try Block"+e);
		}
		
	}

}

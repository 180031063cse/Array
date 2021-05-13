import java.util.Scanner;
public class pgm1 {
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("NEGATIVE");
		}
		else if(a>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("zero");
		}
	}
}

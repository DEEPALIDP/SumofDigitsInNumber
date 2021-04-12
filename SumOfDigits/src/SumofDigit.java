import java.util.Scanner;

public class SumofDigit {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int sum=0,num,reminder;
		System.out.println("Enter number");
		num=sc.nextInt();
		while(num!=0)
		{
			reminder=num%10;
			sum=sum+reminder;
			num=num/10;
			
		}
		System.out.println("sum of digits is="+sum);
	}


}

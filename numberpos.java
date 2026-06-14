package daywise;
import java.util.*;
public class numberpos {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num==0)
		{
			System.out.println("number is zero");
		}
		else
		{
			System.out.println("number is negative");
		}

	}

}

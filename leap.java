package daywise;
import java.util.*;
public class leap {

	public static void main(String[] args) {
		int year;
		Scanner  sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%400==0 && year %100!=0)
		{
			System.out.println(year+" is leap year");
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}

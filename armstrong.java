package daywise;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,r,on;
		on=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+(r*r*r*r);
			num=num/10;
		}
		if(sum==on)
		{
		System.out.println(sum+"isarmstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}

	}

}

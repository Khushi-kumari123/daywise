package daywise;
import java.util.*;
public class pallindrome {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int on,d,rev=0;
	on=n;
	while(n>0)
	{
		d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	if(on==rev)
	{
		System.out.println("pallindome");
	}
	else
	{
		System.out.println("not pallindrome");
	}

	}

}

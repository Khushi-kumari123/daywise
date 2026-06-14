package daywise;
import java.util.*;
public class triangle {

	public static void main(String[] args) {
		int s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		if((s1==s2) || (s2==s3))
		{
			System.out.println("equadilateral");
		}
		else if(s1==s2 || s2!=s3)
		{
			System.out.println("isol");
		}
		else
		{
			System.out.println("scalene");
		}

	}

}

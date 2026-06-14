package daywise;
import java.util.*;
public class fabbonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0,n1=1;
		int n2=n+n1;
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			System.out.print(n+" ");
			n2=n+n1;
			n=n1;
			n1=n2;
		}

	}

}

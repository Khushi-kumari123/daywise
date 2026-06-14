package daywise;
import java.util.*;
public class prime1ton {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ll=sc.nextInt();
	int ul=sc.nextInt();
	int i,j,count=0;
	for(i=ll;i<=ul;i++)
	{
		count=0;
		for(j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			System.out.print(i+" ");
		}
		
	}

	}

}

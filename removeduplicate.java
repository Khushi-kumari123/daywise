package daywise;
import java.util.*;
public class removeduplicate {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		int i;
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(n>0)
		{
			System.out.print(arr[0]+" ");
		}
		for(i=1;i<n;i++)
		{
			if(arr[i]!=arr[i-1])
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}

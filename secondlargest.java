package daywise;
import java.util.*;
public class secondlargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[5];
		int max=0,i,smax;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		smax=max;
		for(i=0;i<n;i++)
		{
			if(arr[i]>max && arr[i]>smax)
			{
				smax=max;
				max=arr[i];
				
			}
			else if(arr[i]>smax && arr[i]!=max)
			{
				smax=arr[i];
			}
		}
		
			System.out.println(smax);
		

	}

}

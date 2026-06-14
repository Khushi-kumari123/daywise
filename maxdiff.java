package daywise;
import java.util.*;
public class maxdiff {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,max=0,min=0;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		min=arr[0];
		for(i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
			System.out.println((max-min));
		

	}

}

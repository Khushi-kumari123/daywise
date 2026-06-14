package daywise;
import java.util.*;
public class movezero {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		int i,j=0;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}

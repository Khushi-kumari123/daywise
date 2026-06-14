package daywise;
import java.util.*;
public class frequencycount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int i,count=1;
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count=count+1;
			}
			else
			{
				System.out.println(arr[i-1]+"->"+count);
				count=1;
			}
		}
		
			System.out.println(arr[n-1]+"->"+count);
		

	}

}

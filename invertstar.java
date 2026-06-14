package daywise;

public class invertstar {

	public static void main(String[] args) {
		int i,j,l;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(l=1;l<=2*i-1;l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

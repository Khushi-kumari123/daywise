package daywise;

public class starpyramid {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<5-i;j++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=2*i-1;l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

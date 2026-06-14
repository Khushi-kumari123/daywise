package daywise;

public class charpyramid {

	public static void main(String[] args) {
		char i,j,k;
		for(i='a';i<='e';i++)
		{
			for(j='a';j<'e'-i;j++)
			{
				System.out.print(" ");
			}
			for(k='a';k<=i;k++)
			{
				System.out.print(k);
			}
			for(k=(char)(i-1);k>='a';k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}

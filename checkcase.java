package daywise;
import java.util.*;
public class checkcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is uppercase");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is lowercase");
		}
		else
		{
			System.out.println(ch+" is special symbol");
		}
		sc.close();
	}

}

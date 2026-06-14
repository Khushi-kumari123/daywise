package daywise;
import java.util.*;
public class unitconver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double cm=sc.nextDouble();
		double m=cm/100;
		double km=cm/10000;
		System.out.println("meter="+m);
		System.out.println("kilometer="+km);
		sc.close();
	}

}

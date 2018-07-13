package ak;
import java.util.Scanner;
public class Swapping {
	public static void main(String...args){
		int a,b,c,temp;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		b=arun.nextInt();
		c=arun.nextInt();
		temp=a;
		a=c;
		c=b;
		b=temp;
		System.out.println(a+" "+b+" "+c);
	}

}

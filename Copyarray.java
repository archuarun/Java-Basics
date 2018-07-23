package ak;
import java.util.Scanner;
public class Copyarray {
	public static void main(String...args){
	int a;
	Scanner arun=new Scanner(System.in);
	a=arun.nextInt();
	int[] b=new int[a];
	int[] c=new int[a];
	for(int i=0;i<b.length;i++){
		b[i]=arun.nextInt();
		c[i]=b[i];
	System.out.print(" "+c[i]);
	}
	arun.close();
}
}

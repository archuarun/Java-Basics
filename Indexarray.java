package ak;
import java.util.Scanner;
public class Indexarray {
	public static void main(String...args){
		int a,i;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		int[] b=new int[a];
		for(i=0;i<b.length;i++){
			b[i]=arun.nextInt();
		}
			System.out.println(b[0]);
	arun.close();
	}
}


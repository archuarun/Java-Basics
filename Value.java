package ak;
import java.util.Scanner;
public class Value {
	public static void main(String...args){
		int a;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		int[]b=new int[a];
		for(int i=0;i<b.length;i++){
			b[i]=arun.nextInt();
		}
			int[] c=new int[a];
			for(int i=0;i<c.length;i++){
				c[i]=arun.nextInt();
			if(c[i]==b[i]){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
			arun.close();
			}
	}
}
			
	

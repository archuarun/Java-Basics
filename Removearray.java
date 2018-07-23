package ak;
import java.util.Scanner;
public class Removearray {
	public static void main(String...args){
		int a,a1,i;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		int[] b=new int[a];
		for(i=0;i<b.length;i++){
			b[i]=arun.nextInt();
		}
		a1=arun.nextInt();
		for(i=0;i<b.length;i++){
			if(a1==b[i]){
	          b[i]=0;
			}
			else{
				System.out.print(" "+b[i]);
			}
			arun.close();
		}
	}
}



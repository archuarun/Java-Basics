package ak;
import java.util.Scanner;
public class Grid {
	public static void main(String...args){
		int b,c,i,j;
		Scanner arun=new Scanner(System.in);
		b=arun.nextInt();
		c=arun.nextInt();
		int[][] a=new int[b][c];
		for(i=0;i<b;i++){
			for(j=0;j<c;j++){
				System.out.print(a[i][j]);
			}
			System.out.println(" ");
		}
	}
}

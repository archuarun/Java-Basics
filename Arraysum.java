package ak;
import java.util.Arrays;
import java.util.Scanner;
public class Arraysum {
	public static void main(String...args){
		int i,sum=0,j;
		int[] a=new int[3];
		Scanner arun=new Scanner(System.in);
		for(i=0;i<a.length;i++){
			a[i]=arun.nextInt();
		}
		for(i=0;i<a.length;i++){
			sum=sum+a[i];
			}
		System.out.println(sum);
	arun.close();
	}
}



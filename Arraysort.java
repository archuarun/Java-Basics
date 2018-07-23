package ak;
import java.util.Arrays;
import java.util.Scanner;
public class Arraysort {
	public static void main(String...args){
		int i;
		int[] a=new int[10];
		Scanner arun=new Scanner(System.in);
		for(i=0;i<a.length;i++){
			a[i]=arun.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			}
		}
	}




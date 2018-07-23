package ak;

import java.util.Scanner;

public class Average {
	public static void main(String...args){
		int a,i,sum=0,sum1=0;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		int[] b=new int[a];
		for(i=0;i<b.length;i++){
			b[i]=arun.nextInt();
		}
			for(i=0;i<b.length;i++){
				sum=sum+b[i];
				sum1=sum/a;
				
			}
			System.out.println("Sum:"+sum);
			System.out.println("Avg:"+sum1);
		}
	}



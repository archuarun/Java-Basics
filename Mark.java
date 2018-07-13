package ak;
import java.util.Scanner;
public class Mark {
	public static void main(String...args){
		int a,b,c,count1=0,count2=0,count3=0;
		Scanner arun=new Scanner(System.in);
		a=arun.nextInt();
		b=arun.nextInt();
		c=arun.nextInt();
		if(a>=35&&a<=100){
			count1++;
		}
		if(b>=35&&b<=100){
			count2++;
		}
		if(c>=35&&c<=100){
		count3++;
		}
		System.out.println(count1+count2+count3);
	arun.close();
}
}


 
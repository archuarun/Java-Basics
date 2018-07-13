package ak;
import java.util.Scanner;
public class Positive {
	public static void main(String...args){
	int i;
	Scanner arun=new Scanner(System.in);
	i=arun.nextInt();
	if(i<0){
		System.out.println("Negative");
	}
		else{
			System.out.println("Positive");
		}
	arun.close();
	
	}
	

}

package ak;
import java.util.Scanner;
public class GuviWords {
	public static void main(String...args){
		int count=1,i,l;
		String s;
		Scanner arun=new Scanner(System.in);
		s=arun.nextLine();
		for(i=0;i<s.length();i++){
			if(s.charAt(i)==' '){
				count++;
				System.out.println(count);
			}
			
		}
	}

}

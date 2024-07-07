package numberBasedProgram;
import java.util.Scanner;
public class Fcatorial2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ending number: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			getFactorial(i);
		}
	}
	public static void getFactorial(int n) {
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Fcatorial of "+n+"!="+fact);
	}


}

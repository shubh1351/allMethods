package numberBasedProgram;

public class Factorial1 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
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

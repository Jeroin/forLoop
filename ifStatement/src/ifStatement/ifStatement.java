
package ifStatement;
import java.util.Scanner;
public class ifStatement {

	public static void main(String[] args) {
		System.out.print("\"Before you can pass the borderline you must enter your age first\"\nPlease enter your age:");
		minorAge();
			
	}
public static void minorAge() {
	Scanner scanAge = new Scanner(System.in);
	int getAge = scanAge.nextInt();
		if(getAge < 18) {
			System.out.println("Sorry you can't pass by because "+ getAge +" years old is a minor.");
			}else{
				System.out.println("You may pass the borderline.");
			}
		scanAge.close();
	}

}

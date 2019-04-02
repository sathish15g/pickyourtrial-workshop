import java.util.Scanner;
import java.util.regex.Pattern;

public class BalancedString {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to validate : ");
		String givenString  = sc.nextLine();
		
		String cond1 = "(([bd]*[ac]){2})*[bd]*";
		String cond2 = "(([ac]*[bd]){2})*[ac]*";
		String input = "cdba";
		boolean matches = Pattern.matches(cond1, givenString) && Pattern.matches(cond2, givenString);
		System.out.println(matches);	
	
		
	}
}

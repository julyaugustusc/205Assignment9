import java.util.*;

public class stackassignment {

	public static void main(String[] args) {
		
		System.out.println("Please enter an integer: ");
		Scanner scan = new Scanner(System.in);
		int integer = scan.nextInt();
		
		Stack<Integer> stacklist = new Stack<Integer>();
		while (integer >= 1) {
			stacklist.push(integer % 10);
			integer = integer /10;
		}
		while (stacklist.size() != 0) {
			System.out.print(stacklist.pop() + " ");
		}
		
		
		
	}
	
}

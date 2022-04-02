import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int userNum;
		String cycle;
		
		do {
		System.out.print("Hello there! Please enter an integer: ");
		
		userNum = scnr.nextInt();
		
		System.out.println("\n");
		
		System.out.printf("%-8s %-10s %-12s %n", "Number", "Squared", "Cubed");
		System.out.printf("%-8s %-10s %-12s %n", "======", "=======", "======");
		
		
		for(int i = 1; i <= userNum; i++) {
			System.out.printf("%-8s %-10s %-12s %n", i, i*i, i*i*i);
		}
		
		System.out.println("\n");
		System.out.printf("      ");
		
		for(int i = 1; i <= userNum; i++) {
			System.out.printf("%4d", i);
		}
		
		System.out.println();
		System.out.println("-------------------------------------------");
		
		for(int i = 1; i <= userNum; i++) {
			System.out.printf("%4d |", i);
			for(int j = 1; j <= userNum; j++) {
				System.out.printf("%4d", i*j);
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		System.out.print("Would you like to continue? (y/n): ");
		
		cycle = scnr.next().toLowerCase();
		
		} while (cycle.equals("y"));
		
		System.out.println("Thank you! Have a nice day!");
		
		scnr.close();
		System.exit(0);
	}

}

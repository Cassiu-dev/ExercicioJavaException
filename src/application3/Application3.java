package application3;

import java.util.Locale;
import java.util.Scanner;

import model.entities3.Account3;
import model.exception3.DomainException3;


public class Application3 {
	
	
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
		System.out.println("Enter account data");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.next();
		System.out.println("Initial Balance: ");
		Double balanced = sc.nextDouble();
		System.out.println("Withdrawn limit: ");
		Double withdrawnLimit = sc.nextDouble();
		
		Account3 cc1 = new Account3(number, holder, balanced, withdrawnLimit);
		
		System.out.println();
		
		System.out.println("Enter amount for withdrawn");
		Double amount = sc.nextDouble();
		cc1.withdrawn(amount);
		
		System.out.println(cc1);
		
		}
		catch(DomainException3 e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}
	
	
		
		
		
		sc.close();
	}

}

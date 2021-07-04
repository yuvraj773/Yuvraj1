package net.codejava;
import java.util.*;
public class Email_java {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String x=sc.next();
		System.out.println("Enter your last name: ");
		String y=sc.next();
		
		Email em1=new Email(x,y);

		em1.setAlternateEmail("yuvi@gmail.com");
		System.out.println("Alternate Email: "+em1.getAlternateEmail());
				
		System.out.println(em1.showInfo());
	}

}

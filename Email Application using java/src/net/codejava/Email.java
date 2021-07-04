package net.codejava;
import java.util.*;
public class Email {

	private String firstname,lastname,password,department,email,alternateEmail;
	private int mailboxcapacity=500,defaultpasswordlength=10;
	private String companysuffix="company.com";
	

	//constructor to receive the first name and last name
	public Email(String firstname, String lastname) {
		
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println("Email created: "+this.firstname+ " " +this.lastname);
		
		this.department=setDepartment();
			
		this.password=randompassword(defaultpasswordlength);
		System.out.println("******************************");
		System.out.println("Your password: "+ this.password);
		
		//Combine element to generate email
		email=firstname.toLowerCase()+ "." +lastname.toLowerCase()+"@"+department+companysuffix;
		
		System.out.println("Your Email is: "+email);
		System.out.println("******************************");
	}
	
	private String setDepartment() {
		
		
		System.out.print("DEPARMENT CODES\n"
				+ "1 for sales\n"
				+ "2 forDevelopment\n"
				+ "3 for Accounting\n"
				+ "0 for none\n"
				+ "Enter the department code: ");
		
		Scanner sc=new Scanner(System.in);
		int depchoice=sc.nextInt();
		if(depchoice==1)
		{return "sales";}
		else if(depchoice==2)
		{return "dev";}
		else if(depchoice==3)
		{return "acct";}
		else 
		{return "";}
				
		}
	
	private String randompassword(int length) {
		
		String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvwxyz"
				+ "/*-*&^%$#@!";
		char[] password=new char[length];
		
		for(int i=0;i<length;i++)
		{
			int rand=(int) (Math.random()* passwordset.length());
			password[i]=passwordset.charAt(rand);
		}
		return new String(password);
	}
	
			
		// set the mailbox capacity
	public void setMailboxcapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	
	//change the password
	public void changepassword(String password) {
		this.password=password;
	}
	
	public int getMailboxcapacity() {return mailboxcapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo() {
	 return "DISPLAY NAME: " + firstname +" "+lastname+"\n"+
			 "COMPANY EMAIL: "+email+"\n"+
			 "MAILBOX CAPACITY: "+mailboxcapacity+"mb";
	 
	}
}


/*Question
 *Scenario: you are an IT support Administrator specialist and are charged with the task of creating email
  accounts for new hires.
  your application should do the following:
  1.Generate an email with the following syntax:firstname.lastname@deparment.company.com
  2.Determine the department(sales,developement,accounting),if none leave blank
  3.Have set methods to change the password,set the mailbox capacity,and define an alternate email address
  4.Have get methodsto display the name,email,and mailbox capacity */
  

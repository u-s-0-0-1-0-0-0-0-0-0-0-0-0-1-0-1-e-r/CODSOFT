//every time the bank balance is 1000 in the starting.
//minimum withdraw balance is 1499 everytime except 1st withdraw .
//maximum deposit balance is 10000 
//otherwise it will break

package atm;

import java.util.Scanner;

public class AtmMachine {
 
	@SuppressWarnings("resource")
	public static void login() {
		
		Scanner sc= new Scanner(System.in);
		int inp1=sc.nextInt();
		if(inp1==2) {
			System.out.println("logged in!");
		}
		else if(inp1==1) {
			System.out.println("account created!");
		}
		else {
			System.out.println("enter valid number:");
			login();
		}
	}
	
	
	@SuppressWarnings("resource")
	public static void bankingFacility() {
		AtmInterface user=new Account();
		int money=1000;
		System.out.println("which operation do you want?");
		//int i=1;
		while(true) {
			int money2=0;
			//int money3=0;
		System.out.println("1 for cash withdraw, 2 for cash credit , 3 for check balance, 4 for exit");
		Scanner sc= new Scanner(System.in);
		int inp2=sc.nextInt();
		if(inp2==1) {
			System.out.println("Put the amount:");
			int inp3=sc.nextInt();
			money=user.withdraw(inp3);
			if(inp3<1500) {
			System.out.println("Debited.");
			System.out.println("Do you want to check balance press 5 or press 0");
			int inp=sc.nextInt();
			if(inp==5){
				money2=user.checkbalance(money);
				System.out.println(money2);
				System.out.println("Thank you!");
			}
            else {
				
				System.out.println("Thank you!");
			}
			}
			else {
				System.out.println("failed");
				System.out.println("exited!");
				break;
				
			}
			
				/*System.out.println("do you want to continue: press 9");
				int inp9=sc.nextInt();
				if(inp9==9){
					bankingFacility();
				}
			}
			*/
			
		}
		else if(inp2==3) {
		    System.out.println(user.checkbalance(money));
		    System.out.println("Thank you!");
		}
		else if(inp2==2) {
			System.out.println("Put the amount:");
			int inp4=sc.nextInt();;
			money=user.deposit(inp4);
			if(inp4<10000) {
			System.out.println("Credited.");
			System.out.println("Do you want to check balance press 5 or press 0");
			int inp=sc.nextInt();
			if(inp==5){
				money2=user.checkbalance(money);
				System.out.println(money2);
				System.out.println("Thank you!");
				
				
			}
			else {
				System.out.println("Thank you!");
			}
			}
			else {
				System.out.println("amount exceeds 10000!");
				System.out.println("exited!");
				break;
			}
			
			
		}
		
		else if(inp2==4){
			System.out.println("Exited! Thank you!");
			break;
		}
		
		else {
			System.out.println("Give right input please:");
			bankingFacility();
		}
		//i++;
	}
	}	
	public static void main(String[] args) {
		System.out.println("Welcome to Banking System!");
		System.out.println("New user? 1 for yes or 2 for no");
		
		login();
		bankingFacility();
	}
}




/* @SuppressWarnings("unused")
	private int balance;
   
  public int getBalance() {
		return balance;
	}


	public int setBalance(int balance) {
		return this.balance = balance;
	}*/

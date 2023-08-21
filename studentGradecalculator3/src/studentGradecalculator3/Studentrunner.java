package studentGradecalculator3;

import java.util.Scanner;
public class Studentrunner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//input: take marks obtained(out of 100) in each subject
			
			System.out.println("Enter your name;");
			String name=sc.nextLine();
			Student student=new Student(name);
			System.out.println("Please enter the number of subjects:-");
			
			int input = sc.nextInt();
			System.out.println("Your Number of subjects are:-"+input);
			
			
			// subject wise marks
			
			int[] subject=new int[input+1];
			//student.information(input,subject);
			int sum=0;
			for(int i=0;i<input;i++) {
				System.out.println("Subject "+(i+1)+"=");
				subject[i]= sc.nextInt();
				sum=sum+subject[i];
			}
			
			//calculate total marks
			
			int total=sum;//student.total(subject,input);
			System.out.println("Your Grand total is:-"+ total+"/"+100*input);
			
			
			//calculate average percentage
			
			float percentage= student.percentage(total,input) ;
			System.out.println("Your average percentage is:-"+percentage);
			
			
			// grade calculation
			String grade= student.gradetotal(percentage);
			System.out.println("Your grade is:"+grade);
			//display results
		}


	}

}

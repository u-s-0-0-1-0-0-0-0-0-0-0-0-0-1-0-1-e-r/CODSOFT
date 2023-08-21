package studentGradecalculator3;

//import java.util.Scanner;
public class Student {
	@SuppressWarnings("unused")
	private String name;

	Student(String name){
    	this.name=name;
    }
	
	
	/*public void information(int input, int[] subject) {
		for(int i=0;i<input;i++) {
			System.out.println("Subject "+(i+1)+"=");
			try (Scanner sc = new Scanner(System.in))
			{		 
				subject[i]= sc.nextInt();
			}
			
		}
		
	}*/
	

	/*public int total(int[] subject, int input) {
		int sum=0;
		for(int i=0;i<input;i++) {
			sum=sum+subject[i];
		}
		return sum;
	}*/
	
	
	
	public float percentage(int total,int input) {
		return total/(float)input;
	}
	
	
	
	public String gradetotal(double percentage) {
		if(percentage>=90&&percentage<=100) {
			return "O";
		}
		else if(percentage>=80&&percentage<90) {
			return "A+";
		}
		else if(percentage>=70&&percentage<80) {
			return "A";
		}
		else if(percentage>=60&&percentage<70) {
			return "B+";
		}
		else if(percentage>=50&&percentage<60) {
			return "B";
		}
		else if(percentage>=40&&percentage<50) {
			return "C";
		}
		else if(percentage>=30&&percentage<=40) {
			return "D";
		}
		else {
			return "F";
		}
	}
		
}

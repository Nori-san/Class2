import java.util.Scanner;

public class Act2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#4");
		Scanner input = new Scanner(System.in); 
		int num1,num2,num3;
		System.out.print("Enter the first number: ");
		num1 = input.nextInt();
		System.out.print("Enter the second number: ");
		num2 = input.nextInt();
		System.out.print("Enter the third number: ");
		num3 = input.nextInt();
		
		int avg = (num1 + num2 + num3) / 3;
		
		System.out.println("The average is " + avg);
		input.close();
	}

}

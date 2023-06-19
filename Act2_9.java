import java.util.Scanner;

public class Act2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#9");
		Scanner input = new Scanner(System.in); 
		
		int number, count;
		System.out.print("Enter a number:  ");
		
		number  = input.nextInt();
		count = 1;
		
		System.out.println("Multiplication table of " + number + ":");
		System.out.println(number + " x " + count + " = " + number);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		count++;
		System.out.println(number + " x " + count + " = " + number * count);
		input.close();
	}

}

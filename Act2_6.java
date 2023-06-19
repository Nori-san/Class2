import java.util.Scanner;

public class Act2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#6");
		Scanner input = new Scanner(System.in);
		System.out.print("Input a Decimal Number: ");
		int dec = input.nextInt();
		String binary = Integer.toBinaryString(dec);
		
		System.out.println(binary);
		input.close();		
	}

}

import java.util.Scanner;

public class Act2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#10");
		Scanner input = new Scanner(System.in);
        
		int a, b, swap;
        System.out.print("Enter the value of a: ");
        a = input.nextInt();
        System.out.print("Enter the value of b: ");
        b = input.nextInt();
        
        swap = a;
        a = b;
        b = swap;
        
        System.out.println("Swapping...");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        input.close();
	}

}

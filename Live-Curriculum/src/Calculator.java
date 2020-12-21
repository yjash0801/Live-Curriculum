import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		System.out.println("-----Welcome to the Arithmetic Calculator-----");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter the Operation you want to perform:"
				+ "\n 1. Addition"
				+ "\n 2. Substraction"
				+ "\n 3. Multiplication"
				+ "\n 4. Division");
		int o = sc.nextInt();
		switch(o)
		{
		case 1:
			System.out.println(n1+n2);
			break;
		case 2:
			System.out.println(n1-n2);
			break;
		case 3:
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println(n1/n2);
			break;
		default:
			System.out.println("Invalid Input or Operation!!!");
		}
	}
}

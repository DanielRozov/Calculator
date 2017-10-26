package lt.vtvpmc.emc.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("**************************");
			System.out.println("* 1. Sumavimas (sum) *");
			System.out.println("**************************");
			System.out.println("* 1. Atemimas (sub) *");
			System.out.println("**************************");
			System.out.println("* 1. Dauginimas (mul) *");
			System.out.println("**************************");
			System.out.println("* 1. Dalinimas (div) *");
			System.out.println("**************************");
			System.out.println("* 1. Kelimas laipsniu (pow) *");
			System.out.println("**************************");
			String menuNumber = sc.next();
			switch (menuNumber) {
			case "sum": {
				System.out.println("Input first number: ");
				int a = sc.nextInt();
				System.out.println("Input second number: ");
				int b = sc.nextInt();
				System.out.println("Sum result: " + sum(a, b));
				break;
			}
			case "sub": {
				System.out.println("Input first number: ");
				int a = sc.nextInt();
				System.out.println("Input second number: ");
				int b = sc.nextInt();
				System.out.println("Sub result: " + sub(a, b));
				break;

			}
			case "mul": {
				System.out.println("Input first number: ");
				int a = sc.nextInt();
				System.out.println("Input second number: ");
				int b = sc.nextInt();
				System.out.println("Mul result: " + mul(a, b));
				break;

			}
			case "div": {
				System.out.println("Input first number: ");
				int a = sc.nextInt();
				System.out.println("Input second number: ");
				int b = sc.nextInt();
				System.out.println("Div result: " + div(a, b));
				break;

			}
			case "pow": {
				System.out.println("Input first number: ");
				int a = sc.nextInt();
				System.out.println("Input second number: ");
				int b = sc.nextInt();
				System.out.println("Pow result: " + pow(a, b));
				break;

			}
			default: {
				System.out.println("Pabaiga!");
				break;

			}

			}
			
		}

	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;

	}

	static int mul(int a, int b) {
		return a * b;

	}

	static int div(int a, int b) {
		return a / b;

	}

	static int pow(int a, int b) {
		return (int) (Math.pow(a, b));

	
	}

}

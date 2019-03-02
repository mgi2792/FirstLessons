package lesson3;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Enter hour (24 hr format): ");
		int h = reader.nextInt();
		System.out.print("Enter minute: ");
		int m = reader.nextInt();
		System.out.print("Enter second: ");
		int s = reader.nextInt();
		
		Clock clk = new Clock(h, m, s);
		clk.displayUSclock();
		
		reader.close();

	}

}

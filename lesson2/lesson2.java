package lesson2;

import java.util.Scanner;

public class lesson2 {

	public static void main(String[] args) {
		
		double tuna = 5.28;
		System.out.print("tuna = " + tuna + "\n");
		
		Scanner in = new Scanner(System.in);
		if (in.hasNext()) {
			System.out.println(in.nextLine());
		}
		System.out.println("Done");
		in.close();
	}
}

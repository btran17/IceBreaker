package com.company;
/*
    Brittney Tran
    08/24/19
    Birthday Guessing Game: Ice Breaker
    CSC: 1120-01
 */
import java.util.Scanner;

public class Main {
	static String str = " ";
	static Scanner scan = new Scanner(System.in);
	static int date = 0;

	private static void intro() {
		System.out.println("Welcome to the Birthday Guessing Game!");
		System.out.println("An Ice-Breaking Game \n");
		System.out.println("Type something to begin.");
		str = scan.next();
	}

	public static void end() {
		System.out.println("\nYour binary number is: ");
		System.out.print(Integer.toBinaryString(date));
	}

	public static void main(String[] args) {
		intro();

		//Birthday date
//		int date = 0;
//		String b = "";

		String c0 = "1  3  5  7 \n" + "9  11 13 15 \n" + "17 19 21 23 \n" + "25 27 29 31 \n";
		String c1 = "2  3  6  7 \n" + "10 11 14 15 \n" + "18 19 22 23 \n" + "26 27 30 31 \n";
		String c2 = "4  5  6  7 \n" + "12 13 14 15 \n" + "20 21 22 23 \n" + "28 29 30 31 \n";
		String c3 = "8  9  10 11 \n" + "12 13 14 15 \n" + "24 25 26 27 \n" + "28 29 30 31 \n";
		String c4 = "16 17 18 19 \n" + "20 21 22 23 \n" + "24 25 26 27 \n" + "28 29 30 31 \n";

			//set 1
			System.out.println("Is your birthday date in set1? \n");
			System.out.print(c0);
			System.out.println("Enter (Y) or (N)");
			str = scan.next();
			if (str.trim().toUpperCase().contains("Y")) {
				date += 1;
//				b = b + 1;
			} else if (str.trim().toUpperCase().contains("N")) {
				date += 0;
//				b = b + 0;
			}
			else {
				System.out.println("Invalid input \n");
				System.exit(0);
			}

			//set2
			System.out.println("Is your birthday date in set2? \n");
			System.out.print(c1);
			System.out.println("Enter (Y) or (N)");
			str = scan.next();
			if (str.trim().toUpperCase().contains("Y")) {
				date += 2;
//				b = b + 1;
			} else if (str.trim().toUpperCase().contains("N")) {
				date += 0;
//				b = b + 0;
			}
			else {
				System.out.println("Invalid input");
				System.exit(0);
			}

			//set3
			System.out.println("Is your birthday date in set3? \n");
			System.out.print(c2);
			System.out.println("Enter (Y) or (N)");
			str = scan.next();
			if (str.trim().toUpperCase().contains("Y")) {
				date += 4;
//				b = b + 1;
			} else if (str.trim().toUpperCase().contains("N")) {
				date += 0;
//				b = b + 0;
			}
			else {
				System.out.println("Invalid input");
				System.exit(0);
			}

			//set4
			System.out.println("Is your birthday date in set4? \n");
			System.out.print(c3);
			System.out.println("Enter (Y) or (N)");
			str = scan.next();
			if (str.trim().toUpperCase().contains("Y")) {
					date += 8;
//					b = b + 1;
			} else if (str.trim().toUpperCase().contains("N")) {
					date += 0;
//					b = b + 0;
			} else {
					System.out.println("Invalid input");
					System.exit(0);
			}

			//set5
			System.out.println("Is your birthday date in set5? \n");
			System.out.print(c4);
			System.out.println("Enter (Y) or (N)");
			str = scan.next();
			if (str.trim().toUpperCase().contains("Y")) {
					date += 16;
//					b = b + 1;
			} else if (str.trim().toUpperCase().contains("N")) {
					date += 0;
//					b = b + 0;
			}

	System.out.println("Your birthday is " + date + "!");
	end();
				//Binary conversion
//				System.out.println(b);
	}
}

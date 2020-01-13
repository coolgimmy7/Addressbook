package com.bridgelabz.felloship.main;

import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.felloship.utility.Utility;

public class AddressBook {

	public static void main(String[] args) throws IOException {
		System.out.println("*****************MyAddressBook***************");
		action();
	}

	@SuppressWarnings("resource")
	public static void action() throws IOException {
		System.out.println("File");
		System.out.println("Menu :1 -> Create New Book\n" + "      2 -> Edit existing book \n"
				+ "      3 -> Read Book \n" + "      4 -> Quit");
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nYour Choice is -> ");
		int choice = Utility.isvalidInteger();
		switch (choice) {
		case 1:
			Utility.createfile();
			break;
		case 2:
			Utility.openfile();
			Operations.selectaction();
			break;
		case 3:
			// read any file
			Utility.openfile();
			Operations.SortbyName();
			System.out.println("**********************");
			action();
			break;
		case 4:
			// exit
			System.out.println();
			System.out.println("Thank you...." + "Have a Nice Day...!");
			return;
		default:
			System.out.println();
			System.out.println("invalid choice..." + "select again \n");
			action();
			break;
		}
	}
}
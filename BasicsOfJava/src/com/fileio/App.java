package com.fileio;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// create a file

		File f = new File(".\\src\\com\\fileio\\java.txt");

		int choice = 0;
		do {
			choice = menu();
			switch (choice) {
			case 1:
				createFile(f);
				break;

			case 2:
				deleteFile(f);
				break;

			case 3:
				writeToFile(f);
				break;

			case 4:
				readFromFile(f);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (choice != 0);

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param f
	 */
	private static void readFromFile(File f) {
		try
		{
			FileReader fr = new FileReader(f);
			Scanner sc = new Scanner(fr);
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method write user entered messages into the file.
	 * 
	 * @param f : File object where data needs to be written
	 */
	private static void writeToFile(File f) {
		try (FileWriter fw = new FileWriter(f, true)) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter message to write into the file :: ");
			String msg = sc.nextLine();
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
			fw.write(df.format(LocalDateTime.now()) + "\t" + msg + "\n");
			System.out.println("Operation sucessful....");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * deletes the file
	 * 
	 * @param f : File object which needs to be deleted
	 */
	private static void deleteFile(File f) {
		if (f.delete())
			System.out.println("\nFile has been deleted sucessfully.");
		else
			System.err.println("\nError : Can't delete mentioned file.s");
	}

	/**
	 * Prints menu for end user to perform CRUD operations
	 * 
	 * @return user entered choice
	 */
	private static int menu() {
		int choice = 0;
		System.out.println("\n1. Create new file");
		System.out.println("2. Delete file");
		System.out.println("3. Write");
		System.out.println("4. Read");
		System.out.print("Enter your choice :: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}

	/**
	 * 
	 * @param f : File class object which holds path of the file which needs to be
	 *          created
	 * @return {@code true} if file has been created or exists. {@code false} if any
	 *         exception got raised
	 */
	private static boolean createFile(File f) {
		try {
			boolean result = f.createNewFile();
			if (result == true) {
				// System.out.println(f.getCanonicalPath());
				System.out.println("\nNew file has been created sucessfully.");
			} else {
				System.err.println("\nFile exists already.");
			}
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}

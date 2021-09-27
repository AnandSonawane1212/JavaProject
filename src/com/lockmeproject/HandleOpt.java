package com.lockmeproject;

import java.util.List;
import java.util.Scanner;

public class HandleOpt {
	public static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOpt.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOper.displayAllFiles("Files");
					break;
				case 2:
					HandleOpt.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void handleFileMenuOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				MenuOpt.displayFileMenuOptions();
				FileOper.createMainFolderIfNotPresent("Files");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					System.out.println("Enter the name of the file to be added to the \"Files\" folder");
					String fileToAdd = sc.next();
					FileOper.createFile(fileToAdd, sc);
					break;
				case 2:
					System.out.println("Enter the name of the file to be deleted from \"main\" folder");
					String fileToDelete = sc.next();
					FileOper.createMainFolderIfNotPresent("Files");
					List<String> filesToDelete = FileOper.displayFileLocations(fileToDelete, "Files");
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
					int idx = sc.nextInt();
					if (idx != 0) {
						FileOper.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						for (String path : filesToDelete) {
							FileOper.deleteFileRecursively(path);
						}
					}
					break;
				case 3:
					System.out.println("Enter the name of the file to be searched from \"Files\" folder");
					String fileName = sc.next();					
					FileOper.createMainFolderIfNotPresent("Files");
					FileOper.displayFileLocations(fileName, "Files");					
					break;
				case 4:
					return;
				case 5:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleFileMenuOptions();
			}
		} while (running == true);
	}
}

package com.lockmeproject;

public class MenuOpt {

	public static void printWelcomeScreen(String appName, String developerName) {
		String companyDetails = String.format("*****************************************************\n"
				+ "** Welcome to %s.com. \n" + "** This application was developed by %s.\n"
				+ "*****************************************************\n", appName, developerName);
		System.err.println(companyDetails);
		String appFunction = "You can use this application to :-\n"
				+ "\tRetrieve all file names in the \"Files\" folder\n"
				+ "\tSearch, add, or delete files in \"Files\" folder.\n"
				+ "\n\t**Please be careful to ensure the correct filename is provided for searching or deleting files.**\n";
//		System.out.println(companyDetails);

		System.out.println(appFunction);
	}

	public static void displayMenu() {
		String menu = "\n\n### Select any option number from below and press Enter ###\n\n"
				+ "\t1) Retrieve all files inside \"Files\" folder\n" + "\t2) Display menu for File operations\n"
				+ "\t3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileMenuOptions() {
		String fileMenu = "\n\n### Select any option number from below and press Enter ###\n\n"
				+ "\t1) Add a file to \"Files\" folder\n" + "\t2) Delete a file from \"Files\" folder\n"
				+ "\t3) Search for a file from \"Files\" folder\n" + "\t4) Show Previous Menu\n" + "\t5) Exit program\n";

		System.out.println(fileMenu);
	}

}

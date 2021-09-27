package com.lockmeproject;


public class MainFile {
	public static void main(String[] args) {		
		FileOper.createMainFolderIfNotPresent("Files");		
		MenuOpt.printWelcomeScreen("LockedMe", "Anand Sonawane");		
		HandleOpt.handleWelcomeScreenInput();
	}
}
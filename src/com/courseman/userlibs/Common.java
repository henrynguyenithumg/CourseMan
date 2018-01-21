package com.courseman.userlibs;

import java.util.logging.Level;
import java.util.logging.Logger;

import references.StudentManager;
import userlib.TextIO;

public abstract class Common {
	private final Logger logger = Logger.getLogger(StudentManager.class.getName());

	public boolean confirmContinue(char confirm) {
		boolean flag = false;

		if (Character.toUpperCase(confirm) == 'Y') {
			flag = true;
		} else if (Character.toUpperCase(confirm) == 'N') {
			// ignore because flag = false (init)
		}

		return flag;
	}

	public char confirmYesOrNo(String message) {
		boolean flag = true;
		char confirm = 0;

		while (flag) {
			try {
				TextIO.putln(message);
				confirm = TextIO.getChar();
				if (Character.toUpperCase(confirm) != 'Y' && Character.toUpperCase(confirm) != 'N') {
					logger.log(Level.WARNING, "Just enter Y or N. Please enter again!");
					continue;
				} else {
					flag = false;
				}
			} catch (Exception exception) {
				if (Character.toUpperCase(confirm) != 'Y' && Character.toUpperCase(confirm) != 'N') {
					logger.log(Level.WARNING, "Just enter Y or N. Please enter again!");
					continue;
				} else {
					flag = false;
				}
			}
		}

		return confirm;
	}
	
	public char enterGrade(String message) {
		boolean flag = true;
		char grade = 0;
		
		while (flag) {
			try {
				TextIO.putln(message);
				grade = TextIO.getChar();
				if (Character.toUpperCase(grade) != 'E' && Character.toUpperCase(grade) != 'G' && Character.toUpperCase(grade) != 'P' && Character.toUpperCase(grade) != 'F') {
					logger.log(Level.WARNING, "Just enter 'E' (excellent), 'G' (good), 'P' (pass), or 'F' (failed). Please enter again!");
					continue;
				} else {
					flag = false;
				}
			} catch (Exception exception) {
				if (Character.toUpperCase(grade) != 'E' && Character.toUpperCase(grade) != 'G' && Character.toUpperCase(grade) != 'P' && Character.toUpperCase(grade) != 'F') {
					logger.log(Level.WARNING, "Just enter 'E' (excellent), 'G' (good), 'P' (pass), or 'F' (failed). Please enter again!");
					continue;
				} else {
					flag = false;
				}
			}
		}
		
		return grade;
	}
}

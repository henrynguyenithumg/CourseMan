package com.courseman.userlibs;

import com.courseman.config.Constants;

public abstract class Common {
	public boolean confirmContinue(char confirm) {
		return Character.toUpperCase(confirm) == 'Y' ? true : false;
	}

	public char confirmYesOrNo(String message) {
		boolean flag = true;
		char confirm = 0;
		while (flag) {
			try {
				TextIO.putln(message);
				confirm = TextIO.getChar();
				if (Character.toUpperCase(confirm) != Constants.YES && Character.toUpperCase(confirm) != Constants.NO) {
					TextIO.put(Constants.ERR_CONFIRM);
					continue;
				} else {
					flag = false;
				}
			} catch (Exception exception) {
				if (Character.toUpperCase(confirm) != Constants.YES && Character.toUpperCase(confirm) != Constants.NO) {
					TextIO.put(Constants.ERR_CONFIRM);
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
				if (Character.toUpperCase(grade) != Constants.GRADE_EXCELLENT
						&& Character.toUpperCase(grade) != Constants.GRADE_GOOD
						&& Character.toUpperCase(grade) != Constants.GRADE_PASS
						&& Character.toUpperCase(grade) != Constants.GRADE_FAILED) {
					TextIO.put(Constants.ERR_GRADE);
					continue;
				} else {
					flag = false;
				}
			} catch (Exception exception) {
				if (Character.toUpperCase(grade) != Constants.GRADE_EXCELLENT
						&& Character.toUpperCase(grade) != Constants.GRADE_GOOD
						&& Character.toUpperCase(grade) != Constants.GRADE_PASS
						&& Character.toUpperCase(grade) != Constants.GRADE_FAILED) {
					TextIO.put(Constants.ERR_GRADE);
					continue;
				} else {
					flag = false;
				}
			}
		}
		return grade;
	}
}

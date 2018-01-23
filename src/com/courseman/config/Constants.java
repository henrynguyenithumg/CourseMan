package com.courseman.config;

import com.courseman.userlibs.TextIO;

public interface Constants {
	/**
	 * Connect to DB
	 */
	public static final String DRIVER = "jdbc:postgresql://%s/%s";
	public static final String HOST = "localhost:5432";
	public static final String DB_NAME = "courseman";
	public static final String USERNAME = "postgres";
	public static final String PASSWORD = "postgres";
	
	public static final String CHOICE = "Your choice ==> ";
	public static final String BACK_TO_MAIN = ". Back to management menu";
	public static final int THIS_YEAR = 2018;
	public static final char YES = 'Y';
	public static final char NO = 'N';
	public static final char GRADE_EXCELLENT = 'E';
	public static final char GRADE_GOOD = 'E';
	public static final char GRADE_PASS = 'P';
	public static final char GRADE_FAILED = 'F';
	public static final String ERR_CONFIRM = "Just enter Y or N. Please enter again!";
	public static final String ERR_GRADE = "Just enter 'E' (excellent), 'G' (good), 'P' (pass), or 'F' (failed). Please enter again!";
	
	public static final int EXIT_CASE = 0;

	/**
	 * TYPE Query
	 */
	public static final int QUERY_TYPE_CREATE = 1;
	public static final int QUERY_TYPE_READ = 2;
	public static final int QUERY_TYPE_UPDATE = 3;
	public static final int QUERY_TYPE_DELETE = 4;

	/**
	 * MAIN case + menu
	 */
	public static final int MAIN_CASE_STUDENT = 1;
	public static final int MAIN_CASE_MODULE = 2;
	public static final int MAIN_CASE_ENROLL = 3;

	static void showMainMenu() {
		TextIO.putln("---------------- MANAGEMENT ----------------");
		TextIO.putln(MAIN_CASE_STUDENT + ". Manage Student");
		TextIO.putln(MAIN_CASE_MODULE + ". Manage Module");
		TextIO.putln(MAIN_CASE_ENROLL + ". Manage Enrolment");
		TextIO.putln(EXIT_CASE + ". Exit");
	}
	
	/**
	 * STUDENT case + menu
	 */
	public static final int STUDENT_CASE_ADD = 1;
	public static final int STUDENT_CASE_EDIT = 2;
	public static final int STUDENT_CASE_DELETE = 3;
	public static final int STUDENT_CASE_BACK = 4;

	static void showMenuStudent() {
		TextIO.putln("---------------- STUDENTS MANAGE ----------------");
		TextIO.putln(STUDENT_CASE_ADD + ". Add a new student");
		TextIO.putln(STUDENT_CASE_EDIT + ". Edit information of an existing student");
		TextIO.putln(STUDENT_CASE_DELETE + ". Delete a student");
		TextIO.putln(STUDENT_CASE_BACK + BACK_TO_MAIN);
	}
	
	/**
	 * MUDULE case + menu
	 */
	public static final int MODULE_CASE_ADD = 1;
	public static final int MODULE_CASE_EDIT = 2;
	public static final int MODULE_CASE_DELETE = 3;
	public static final int MODULE_CASE_BACK = 4;

	static void showMenuModule() {
		TextIO.putln("---------------- MODULES MANAGE ----------------");
		TextIO.putln(MODULE_CASE_ADD + ". Add a new module");
		TextIO.putln(MODULE_CASE_EDIT + ". Edit information of an existing module");
		TextIO.putln(MODULE_CASE_DELETE + ". Delete a module");
		TextIO.putln(MODULE_CASE_BACK + BACK_TO_MAIN);
	}

	/**
	 * ENROLL case + menu
	 */
	public static final int ENROLL_CASE_ADD = 1;
	public static final int ENROLL_CASE_GET = 2;
	public static final int ENROLL_CASE_ADD_MARK = 3;
	public static final int ENROLL_CASE_REPORT= 4;
	public static final int ENROLL_CASE_REPORT_ASSESSMENT = 5;
	public static final int ENROLL_CASE_SORT = 6;
	public static final int ENROLL_CASE_BACK = 7;

	static void showMenuEnroll() {
		TextIO.putln("---------------- ENROLMENTS MANAGE ----------------");
		TextIO.putln(ENROLL_CASE_ADD + ". Add a new enrolment");
		TextIO.putln(ENROLL_CASE_GET + ". Show  the  enrolment  of  the  specified student and module");
		TextIO.putln(ENROLL_CASE_ADD_MARK + ". Records the internal and examination marks (in that order) into the enrolment of the specified module of the given student");
		TextIO.putln(ENROLL_CASE_REPORT + ". Generates an initial report of all the current enrolments (without marks)");
		TextIO.putln(ENROLL_CASE_REPORT_ASSESSMENT + ". Generates an assessment report of all the enrolments together with their internal, exam marks and final grade");
		TextIO.putln(ENROLL_CASE_SORT + ". Sorts the current enrolments in the descending order of the student identifier");
		TextIO.putln(ENROLL_CASE_BACK + BACK_TO_MAIN);
	}
}

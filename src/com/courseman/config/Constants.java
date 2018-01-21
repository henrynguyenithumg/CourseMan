package com.courseman.config;

import com.courseman.userlibs.TextIO;

public interface Constants {
	/**
	 * Connect to DB
	 */
	public static final String URL = "jdbc:postgresql://%s/%s";
	public static final String HOST = "localhost:5432";
	public static final String DB_NAME = "courseman";
	public static final String USERNAME = "postgres";
	public static final String PASSWORD = "postgres";
	public static final int EXIT_CASE = 0;

	/**
	 * TYPE Query
	 */
	public static final int QUERY_TYPE_CREATE = 1;
	public static final int QUERY_TYPE_READ = 2;
	public static final int QUERY_TYPE_UPDATE = 3;
	public static final int QUERY_TYPE_DELETE = 4;
	public static final int QUERY_TYPE_READ_TO_STRING = 5;
	public static final int QUERY_TYPE_READ_TO_HTML = 6;

	/**
	 * MAIN case + menu
	 */
	public static final int MAIN_CASE_STUDENT = 1;
	public static final int MAIN_CASE_MODULE = 2;
	public static final int MAIN_CASE_ENROLL = 3;
	public static final int MAIN_CASE_REPORT = 4;

	static void showMainMenu() {
		TextIO.putln("---------------- MANAGEMENT ----------------");
		TextIO.putln(MAIN_CASE_STUDENT + ". Manage Student");
		TextIO.putln(MAIN_CASE_MODULE + ". Manage Module");
		TextIO.putln(MAIN_CASE_ENROLL + ". Manage Enrolment");
		TextIO.putln(MAIN_CASE_REPORT + ". Report");
		TextIO.putln(EXIT_CASE + ". Exit");
		TextIO.put("Your choice ==> ");
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
		TextIO.putln(STUDENT_CASE_BACK + ". Back to management menu");
		TextIO.put("Your choice ==> ");
	}

	/**
	 * ENROLL case + menu
	 */
	public static final int ENROLL_CASE_ADD = 1;
	public static final int ENROLL_CASE_GRADE = 2;
	public static final int ENROLL_CASE_BACK = 3;

	static void showMenuEnroll() {
		TextIO.putln("---------------- ENROLMENTS MANAGE ----------------");
		TextIO.putln(ENROLL_CASE_ADD + ". Add an enrolment");
		TextIO.putln(ENROLL_CASE_GRADE + ". Enter grade for a student's enrolment");
		TextIO.putln(ENROLL_CASE_BACK + ". Back to management menu");
		TextIO.put("Your choice ==> ");
	}
}

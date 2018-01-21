package courseman1;

import com.courseman.config.Constants;
import com.courseman.userlibs.Common;
import com.courseman.userlibs.TextIO;

public class StudentManager extends Common {
	/**
	 * 
	 * @param caseNo
	 */
	public void students(int caseNo) {
		switch (caseNo) {
		case Constants.STUDENT_CASE_ADD:
			char confirmAddStudent;
			int studentIdAdd = 0;
			do {
				// Input data
				TextIO.putln("Enter student id: ");
				studentIdAdd = TextIO.getInt();
				TextIO.getlnString();
				// Check student exist
				confirmAddStudent = confirmYesOrNo("Do you wanna add more student? Y or N => ");
			} while (confirmContinue(confirmAddStudent));

			break;
		case Constants.STUDENT_CASE_EDIT:
			char confirmUpdateStudent = 0;
			int studentIdUpdate = 0;
			do {
				// Enter id of student wanna change infor
				TextIO.putln("Enter id of student wanna change infor: ");
				studentIdUpdate = TextIO.getInt();
				TextIO.getlnString();
				// Check student exist
				confirmUpdateStudent = confirmYesOrNo("Do you wanna update more student? Y or N => ");
			} while (confirmContinue(confirmUpdateStudent));

			break;
		case Constants.STUDENT_CASE_DELETE:
			char confirmDeleteStudent = 0;
			int studentIdDelete = 0;
			do {
				// Enter id of student wanna change infor
				TextIO.putln("Enter id of student wanna delete: ");
				studentIdDelete = TextIO.getInt();
				TextIO.getlnString();
				// Check student exist
				confirmDeleteStudent = confirmYesOrNo("Do you wanna delete more student? Y or N => ");
			} while (confirmContinue(confirmDeleteStudent));

			break;

		case Constants.STUDENT_CASE_BACK:
			// ignore
			break;
		case Constants.EXIT_CASE:
			System.exit(0);
		default:
			TextIO.putln("Does not have this function. Please select again!");
			break;
		}
	}
}

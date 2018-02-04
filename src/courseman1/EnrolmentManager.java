package courseman1;

import com.courseman.config.Constants;
import com.courseman.domain.Enrolment;
import com.courseman.userlibs.Common;
import com.courseman.userlibs.TextIO;

public class EnrolmentManager extends Common {
	/**
	 * 
	 * @param caseNo
	 */
	public void students(int caseNo, Enrolment[] lstEnrolment) {
		switch (caseNo) {
		case Constants.ENROLL_CASE_ADD:
			char confirmAddEnroll;
			int enrollmentIdAdd = 0;
			do {
				// Input data
				TextIO.putln("Enter enrollment id: ");
				enrollmentIdAdd = TextIO.getInt();
				TextIO.getlnString();
				// Check enrollment exist
				confirmAddEnroll = confirmYesOrNo("Do you wanna add more enrollment? Y or N => ");
			} while (confirmContinue(confirmAddEnroll));
			break;
		case Constants.ENROLL_CASE_GET:
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
		case Constants.ENROLL_CASE_ADD_MARK:
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

		case Constants.ENROLL_CASE_REPORT:
			// ignore
			break;
		case Constants.ENROLL_CASE_REPORT_ASSESSMENT:
			// ignore
			break;
		case Constants.ENROLL_CASE_SORT:
			// ignore
			break;
		case Constants.ENROLL_CASE_BACK:
			// ignore
			break;
		default:
			TextIO.putln("Does not have this function. Please select again!");
			break;
		}
	}
}

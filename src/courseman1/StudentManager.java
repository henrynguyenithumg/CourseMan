package courseman1;

import java.util.Date;

import com.courseman.config.Constants;
import com.courseman.domain.Student;
import com.courseman.userlibs.Common;
import com.courseman.userlibs.TextIO;

public class StudentManager extends Common {
	/**
	 * 
	 * @param caseNo
	 */
	public void students(int caseNo, Student[] lstStudent) {
		switch (caseNo) {
		case Constants.STUDENT_CASE_ADD:
			char confirmAddStudent;
			String studentIdAdd;
			String studentNameAdd;
			Date studentDobAdd;
			String studentAddressAdd;
			String studentEmailAdd;
			do {
				// Input data
				TextIO.putln("Enter student id: ");
				studentIdAdd = TextIO.getlnString();
				// Check student exist
				if (!checkExistStudent(studentIdAdd, lstStudent)) {
					TextIO.putln("Enter student name: ");
					studentNameAdd = TextIO.getlnString();
					// Do text io lởm :))) éo có nhập ngày, chắc chuyển string thôi
//					TextIO.putln("Enter student dob: ");
//					studentDobAdd = TextIO.get;
					TextIO.putln("Enter student address: ");
					studentAddressAdd = TextIO.getlnString();
					TextIO.putln("Enter student email: ");
					studentEmailAdd = TextIO.getlnString();
					for (Student student : lstStudent) {
						if (student == null) {
							student = new Student(studentIdAdd, studentNameAdd, null, studentAddressAdd, studentEmailAdd);
						}
					}
				} else {
					TextIO.putln("Student is exist!");
				}
				confirmAddStudent = confirmYesOrNo("Do you wanna add more student? Y or N => ");
			} while (confirmContinue(confirmAddStudent));

			break;
		case Constants.STUDENT_CASE_EDIT:
			char confirmUpdateStudent = 0;
			String studentIdUpdate;
			do {
				// Enter id of student wanna change infor
				TextIO.putln("Enter id of student wanna change infor: ");
				studentIdUpdate = TextIO.getlnString();
				// Check student exist
				if (!checkExistStudent(studentIdUpdate, lstStudent)) {
				} else {
					TextIO.putln("Student is not exist!");
				}
				confirmUpdateStudent = confirmYesOrNo("Do you wanna update more student? Y or N => ");
			} while (confirmContinue(confirmUpdateStudent));

			break;
		case Constants.STUDENT_CASE_DELETE:
			char confirmDeleteStudent = 0;
			String studentIdDelete;
			do {
				// Enter id of student wanna change infor
				TextIO.putln("Enter id of student wanna delete: ");
				studentIdDelete = TextIO.getlnString();
				// Check student exist
				if (!checkExistStudent(studentIdDelete, lstStudent)) {
				} else {
					TextIO.putln("Student is not exist!");
				}
				confirmDeleteStudent = confirmYesOrNo("Do you wanna delete more student? Y or N => ");
			} while (confirmContinue(confirmDeleteStudent));

			break;

		case Constants.STUDENT_CASE_BACK:
			// ignore
			break;
		default:
			TextIO.putln("Does not have this function. Please select again!");
			break;
		}
	}

	private boolean checkExistStudent(String studentId, Student[] lstStudent) {
		boolean result = false;
		for (Student student : lstStudent) {
			if (student != null && student.getId().equalsIgnoreCase(studentId)) {
				result = true;
			}
		}
		return result;
	}
}

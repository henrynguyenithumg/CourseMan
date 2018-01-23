package courseman1;

import com.courseman.config.Constants;
import com.courseman.userlibs.Common;
import com.courseman.userlibs.TextIO;

public class ModuleManager extends Common {
	/**
	 * 
	 * @param caseNo
	 */
	public void modules(int caseNo) {
		switch (caseNo) {
		case Constants.MODULE_CASE_ADD:
			char confirmAddModule;
			int moduleIdAdd = 0;
			do {
				// Input data
				TextIO.putln("Enter module id: ");
				moduleIdAdd = TextIO.getInt();
				TextIO.getlnString();
				// Check module exist
				confirmAddModule = confirmYesOrNo("Do you wanna add more module? Y or N => ");
			} while (confirmContinue(confirmAddModule));

			break;
		case Constants.MODULE_CASE_EDIT:
			char confirmUpdateModule = 0;
			int moduleIdUpdate = 0;
			do {
				// Enter id of module wanna change infor
				TextIO.putln("Enter id of module wanna change infor: ");
				moduleIdUpdate = TextIO.getInt();
				TextIO.getlnString();
				// Check module exist
				confirmUpdateModule = confirmYesOrNo("Do you wanna update more module? Y or N => ");
			} while (confirmContinue(confirmUpdateModule));

			break;
		case Constants.MODULE_CASE_DELETE:
			char confirmDeleteModule = 0;
			int moduleIdDelete = 0;
			do {
				// Enter id of module wanna change infor
				TextIO.putln("Enter id of module wanna delete: ");
				moduleIdDelete = TextIO.getInt();
				TextIO.getlnString();
				// Check module exist
				confirmDeleteModule = confirmYesOrNo("Do you wanna delete more module? Y or N => ");
			} while (confirmContinue(confirmDeleteModule));

			break;

		case Constants.MODULE_CASE_BACK:
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

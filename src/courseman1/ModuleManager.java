package courseman1;

import com.courseman.config.Constants;
import com.courseman.domain.CompulsoryModule;
import com.courseman.domain.ElectiveModule;
import com.courseman.domain.Module;
import com.courseman.userlibs.Common;
import com.courseman.userlibs.TextIO;

public class ModuleManager extends Common {
	/**
	 * 
	 * @param caseNo
	 */
	public void modules(int caseNo, Module[] lstModule, CompulsoryModule[] lstCompulsoryModule, ElectiveModule[] lstElectiveModule) {
		switch (caseNo) {
		case Constants.MODULE_CASE_ADD:
			char confirmAddModule;
			String moduleCodeAdd;
			String moduleNameAdd;
			int moduleSemeterAdd;
			int moduleCreditsAdd;
			do {
				// Input data
				TextIO.putln("Enter module code: ");
				moduleCodeAdd = TextIO.getlnString();
				// Check module exist
				if (checkExistModule(moduleCodeAdd, lstModule)) {
//					private int compulsoryModuleId;
//					private int electiveModuleId;
					TextIO.putln("Enter module name: ");
					moduleCodeAdd = TextIO.getlnString();
					TextIO.putln("Enter module semeter: ");
					moduleSemeterAdd = TextIO.getInt();
					TextIO.getlnString();
					TextIO.putln("Enter module credits: ");
					moduleCreditsAdd = TextIO.getInt();
					TextIO.getlnString();
					
				} else {
					TextIO.putln("Module is not exist!");
				}
				confirmAddModule = confirmYesOrNo("Do you wanna add more module? Y or N => ");
			} while (confirmContinue(confirmAddModule));
			break;
		case Constants.MODULE_CASE_EDIT:
			char confirmUpdateModule = 0;
			String moduleIdUpdate;
			do {
				// Enter id of module wanna change infor
				TextIO.putln("Enter id of module wanna change infor: ");
				moduleIdUpdate = TextIO.getlnString();
				TextIO.getlnString();
				// Check module exist
				confirmUpdateModule = confirmYesOrNo("Do you wanna update more module? Y or N => ");
			} while (confirmContinue(confirmUpdateModule));

			break;
		case Constants.MODULE_CASE_DELETE:
			char confirmDeleteModule = 0;
			String moduleIdDelete;
			do {
				// Enter id of module wanna change infor
				TextIO.putln("Enter id of module wanna delete: ");
				moduleIdDelete = TextIO.getlnString();
				TextIO.getlnString();
				// Check module exist
				confirmDeleteModule = confirmYesOrNo("Do you wanna delete more module? Y or N => ");
			} while (confirmContinue(confirmDeleteModule));

			break;
		case Constants.MODULE_CASE_BACK:
			// ignore
			break;
		default:
			TextIO.putln("Does not have this function. Please select again!");
			break;
		}
	}
	
	private boolean checkExistModule(String moduleCode, Module[] lstModule) {
		boolean result = false;
		for (Module module : lstModule) {
			if (module != null && module.getCode().equalsIgnoreCase(moduleCode)) {
				result = true;
			}
		}
		return result;
	}
}

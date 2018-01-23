package com.courseman.domain;

public class ElectiveModule extends Module {
	private int moduleId;
	private String departmentName;

	public ElectiveModule() {
		super();
	}

	public ElectiveModule(String code, String name, int semeter, int credits, int compulsoryModuleId,
			int electiveModuleId, int moduleId, String departmentName) {
		super(code, name, semeter, credits, compulsoryModuleId, electiveModuleId);
		this.moduleId = moduleId;
		this.departmentName = departmentName;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	public String toString() {
		return "ElectiveModule [moduleId=" + moduleId + ", departmentName=" + departmentName + "]";
	}
}

package com.courseman.domain;

public class CompulsoryModule extends Module {
	private int moduleId;

	public CompulsoryModule() {
		super();
	}

	public CompulsoryModule(String code, String name, int semeter, int credits, int compulsoryModuleId,
			int electiveModuleId, int moduleId) {
		super(code, name, semeter, credits, compulsoryModuleId, electiveModuleId);
		this.moduleId = moduleId;
	}

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	@Override
	public String toString() {
		return "CompulsoryModule [moduleId=" + moduleId + "]";
	}
}

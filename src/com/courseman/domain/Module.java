package com.courseman.domain;

public class Module {
	private String code;
	private String name;
	private int semeter;
	private int credits;
	private int compulsoryModuleId;
	private int electiveModuleId;

	public Module() {
		super();
	}

	public Module(String code, String name, int semeter, int credits, int compulsoryModuleId, int electiveModuleId) {
		super();
		this.code = code;
		this.name = name;
		this.semeter = semeter;
		this.credits = credits;
		this.compulsoryModuleId = compulsoryModuleId;
		this.electiveModuleId = electiveModuleId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSemeter() {
		return semeter;
	}

	public void setSemeter(int semeter) {
		this.semeter = semeter;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getCompulsoryModuleId() {
		return compulsoryModuleId;
	}

	public void setCompulsoryModuleId(int compulsoryModuleId) {
		this.compulsoryModuleId = compulsoryModuleId;
	}

	public int getElectiveModuleId() {
		return electiveModuleId;
	}

	public void setElectiveModuleId(int electiveModuleId) {
		this.electiveModuleId = electiveModuleId;
	}

	@Override
	public String toString() {
		return "Module [code=" + code + ", name=" + name + ", semeter=" + semeter + ", credits=" + credits
				+ ", compulsoryModuleId=" + compulsoryModuleId + ", electiveModuleId=" + electiveModuleId + "]";
	}
}

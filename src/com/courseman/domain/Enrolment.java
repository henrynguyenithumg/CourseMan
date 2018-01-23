package com.courseman.domain;

public class Enrolment {
	private Student student;
	private Module module;
	private float internalMark;
	private float examinationMark;
	private char finalGrade;

	public Enrolment() {
		super();
	}

	public Enrolment(Student student, Module module, float internalMark, float examinationMark, char finalGrade) {
		super();
		this.student = student;
		this.module = module;
		this.internalMark = internalMark;
		this.examinationMark = examinationMark;
		this.finalGrade = finalGrade;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public float getInternalMark() {
		return internalMark;
	}

	public void setInternalMark(float internalMark) {
		this.internalMark = internalMark;
	}

	public float getExaminationMark() {
		return examinationMark;
	}

	public void setExaminationMark(float examinationMark) {
		this.examinationMark = examinationMark;
	}

	public char getFinalGrade() {
		return finalGrade;
	}

	public void setFinalGrade(char finalGrade) {
		this.finalGrade = finalGrade;
	}

	@Override
	public String toString() {
		return "Enrolment [student=" + student + ", module=" + module + ", internalMark=" + internalMark
				+ ", examinationMark=" + examinationMark + ", finalGrade=" + finalGrade + "]";
	}
}

package com.demo.service;

import com.cdac.Exam;

public class ExamBoard {
	public static Exam getExam(String name) {
		Exam exam = new Exam();
		exam.setCode(123);
		exam.setMode("Online");
		exam.setSubject(name);

		return exam;

	}
}

package com.jh.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		StudentDTO studentDTO = new StudentDTO();
		StudentDTOSecond ss = new StudentDTOSecond();
		ss.history = 50;
		ss.eng = 90;

		StudentDTOThird st = new StudentDTOThird();
		st.physics = 13;
		st.kor = 55;

		StudentDTOFourth sf = new StudentDTOFourth();
		sf.math = 4;
		sf.music = 50;
		sf.physics = 99;

	}
}

package com.jh.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		StudentDTOSecond ss = new StudentDTOSecond();

		ss.kor = 40;
		ss.eng = 3;
		ss.math = 3;
		ss.history = 44;

		ss.setTotal();

		StudentDTOThird st = new StudentDTOThird();

		st.kor = 40;
		st.eng = 6;
		st.math = 4;
		st.physics = 64;
	//	st.setTotal();

	}
}

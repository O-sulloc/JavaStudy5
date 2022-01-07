package com.jh.s1.modifier;

import com.jh.s2.Test2;

public class ModifierMain {

	public static void main(String[] args) {
		Test test = new Test();
		int n = 10;
		test.info(n);

		// Test2 test2 = new Test2();

		// test.num = 10;
		// test2.num2 = 20;
		// 왜 오류가 나냐? test2의 int num2가 default이기 때문이다.
		// 여기서도 쓰고 싶으면 puglic int num2라고 해야댐
	}
}
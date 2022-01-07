package com.jh.s3.member;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.setAge(987);

		System.out.println(member.getAge());

		member.setHeight(98);
		System.out.println(member.getHeight());

		member.setEmail("abc@gmail.com");
		System.out.println(member.getEmail());
	}

}

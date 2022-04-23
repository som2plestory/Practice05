package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member m01 = new Member("정우성","jws", 50000);
		m01.showInfo();
		
		Member m02 = new Member("유재석","yjs", 30000);
		m02.showInfo();
		
		Member m03 = new Member("이효리", "lhr", 40000);
		m03.showInfo();
	}

}

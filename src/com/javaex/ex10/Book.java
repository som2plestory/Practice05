package com.javaex.ex10;

public class Book {
    
	//필드
	private int bookNo; //책 번호
	private String title; // 책 제목
	private String author; // 책 작가
	private int stateCode; // 책 대여보드(대여유무를 나타내는 상태코드)
	
	//생성자
	
	public Book() {
		
	}
	 
	
	public Book(int bookNo, String title,String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		stateCode = 1;
	}
	
	//메소드 - gs
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public int getBookNo(){
		return bookNo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	//메소드 - 일반
	
	public void rent() {
		if(stateCode==1) {
			stateCode = 0;
			System.out.println(title+"이(가) 대여 됐습니다.");
		}
	}
	
	public void print() {
		String state;
		if(stateCode==1) {
			state = "재고있음";
		}else {
			state = "대여중";
		}
		System.out.println(bookNo+" 책 제목:"+title+", 작가:"+author+", 대여 유무:"+state);
	}
}

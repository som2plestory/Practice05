package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("Song(파라미터0개");
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터5개)");
	}	
	
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터6개)");
	}
	
	//결과예측
	/*
	 * Song(파라미터5개")
	 * Song(파라미터6개")
	 */
	public void showInfo() {
		System.out.println("타이틀="+title+", 가수="+artist+", 앨범="+album+", 작곡가="+composer+", 발매년도="+year+", 트랙="+track);
	}
}




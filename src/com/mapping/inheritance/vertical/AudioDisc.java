package com.mapping.inheritance.vertical;


import com.mapping.inheritance.vertical.Disc;

public class AudioDisc extends Disc {
	String SingerName;
	int NoOfSongs;
	public AudioDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AudioDisc(int id, String name, int Price) {
		super(id, name, Price);
		// TODO Auto-generated constructor stub
	}
	public AudioDisc(String singerName, int noOfSongs) {
		super();
		SingerName = singerName;
		NoOfSongs = noOfSongs;
	}
	public String getSingerName() {
		return SingerName;
	}
	public void setSingerName(String singerName) {
		SingerName = singerName;
	}
	public int getNoOfSongs() {
		return NoOfSongs;
	}
	public void setNoOfSongs(int noOfSongs) {
		NoOfSongs = noOfSongs;
	}
	@Override
	public String toString() {
		return "AudioDisc [SingerName=" + SingerName + ", NoOfSongs=" + NoOfSongs + "]";
	}}
	

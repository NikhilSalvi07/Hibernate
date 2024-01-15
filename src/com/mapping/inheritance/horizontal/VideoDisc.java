package com.mapping.inheritance.horizontal;
import com.mapping.inheritance.horizontal.Disc;

public class VideoDisc extends Disc {
  String Director;
  String VideoFormat;
public VideoDisc() {
	super();
	// TODO Auto-generated constructor stub
}
public VideoDisc(int id, String name, int Price) {
	super(id, name, Price);
	// TODO Auto-generated constructor stub
}
public VideoDisc(String director, String videoFormat) {
	super();
	Director = director;
	VideoFormat = videoFormat;
}
public String getDirector() {
	return Director;
}
public void setDirector(String director) {
	Director = director;
}
public String getVideoFormat() {
	return VideoFormat;
}
public void setVideoFormat(String videoFormat) {
	VideoFormat = videoFormat;
}
@Override
public String toString() {
	return "VideoDisc [Director=" + Director + ", VideoFormat=" + VideoFormat + "]";
}
  
}

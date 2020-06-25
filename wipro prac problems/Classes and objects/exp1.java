package com.wipro.classesAndObjects;

class box{
	int wid,hei,dep;
	box(int w,int h,int d){
		wid = w;
		hei = h;
		dep = d;
	}
	int volume() {
		int c = wid*hei*dep;
		return c;
	}
}
public class exp1 {
	public static void main(String[] args) {
		box	obj = new box(2,4,10);
		System.out.println(obj.volume());
		}
}

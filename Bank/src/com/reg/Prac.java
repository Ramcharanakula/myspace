package com.reg;

public class Prac {
	String a="declaration form";
	public class Rev {
		
		void m1() {
		System.out.println("in m1 method of class Rev");
		System.out.println(a.length());
		a=a.concat(" form");
		System.out.println(a);System.out.println(a.length());
		a=a.toUpperCase();
		System.out.println(a);a=a.toLowerCase();System.out.println(a);}
		
	}
	void m2() {
		System.out.println("in m2 method of class Prac");
		Rev r =new Rev();
		r.m1();
	}
	public static void main(String[] args) {
		Prac p=new Prac();
		p.m2();

}}

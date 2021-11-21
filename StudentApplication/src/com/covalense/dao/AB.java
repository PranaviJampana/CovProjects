package com.covalense.dao;

abstract class A {
	void meth1() {
		System.out.println("A");
	}
}
class B extends A{
	void meth1() {
		System.out.println("B");
		super.meth1();
	}
}
public class AB{
	public static void main(String[] args) {
		B b = new B();
		A a = (A)b;
		a.meth1();
		B x = a;
		x.meth1();
	}
}

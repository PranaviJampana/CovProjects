package com.covalense.beans;

public interface B extends A {
	default void meth2() {
		System.out.println("default meth2 of sub interface");
	}
	static void meth3() {
		System.out.println("static meth3 of sub interface");
	}
	
}

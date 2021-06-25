package com.javaex.ex1_1;

public class Person {

	
	//필드
	
	private String name;
	private String ph;
	private String com;
	
	
	
	
	//생성자
	
	public Person(String name, String ph, String com) {
		super();
		this.name = name;
		this.ph = ph;
		this.com = com;
	}


	public Person() {
		super();
	}


	//겟셋

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPh() {
		return ph;
	}


	public void setPh(String ph) {
		this.ph = ph;
	}


	public String getCom() {
		return com;
	}


	public void setCom(String com) {
		this.com = com;
	}


	
	
	
	//메소드 일반
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", ph=" + ph + ", com=" + com + "]";
	}
	
	
	
	
	
	
}
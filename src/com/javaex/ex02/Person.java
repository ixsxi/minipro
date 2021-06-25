package com.javaex.ex02;

public class Person {

	
	//필드
	
	
	private String name;
	private String hp;
	private String comp;
	
	
	
	
	
	//생성자
	
	public Person() {
		super();
	}
	
	
	public Person(String name, String hp, String comp) {
		super();
		this.name = name;
		this.hp = hp;
		this.comp = comp;
	}

	
	//메소드 gs 
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getComp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}


	
	
	//메소드 일반
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", comp=" + comp + "]";
	}
	
	
}

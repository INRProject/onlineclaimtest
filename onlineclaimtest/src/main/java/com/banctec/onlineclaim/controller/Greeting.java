package com.banctec.onlineclaim.controller;

public class Greeting {

	private long id;
	private String content;
	
	
	public Greeting() {
		System.out.println("instan");
	}
	
	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}

package com.java;

import javax.xml.crypto.Data;

public class Answer {
	private int id;
	private String name;
	private Data postedDate;
	public Answer(int id, String name, Data postedDate) {
		super();
		this.id = id;
		this.name = name;
		this.postedDate = postedDate;
	}
	@Override
	public String toString() {
		return "Answer [id=" + id + ", name=" + name + ", postedDate=" + postedDate + "]";
	}
	
}
